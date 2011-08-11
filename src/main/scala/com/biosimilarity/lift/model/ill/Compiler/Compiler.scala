// -*- mode: Scala;-*- 
// Filename:    Compiler.scala 
// Authors:     lgm                                                    
// Creation:    Wed Aug 10 01:50:01 2011 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.seleKt.model.ill.compiler

import com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn._
import com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn.{ Value => SynVal,_}

trait Compiler[Ctxt] {
  import com.biosimilarity.seleKt.model.ill.vm.illvm.executive.SyntaxConversion._

  /*
   * The grammar for the ILL TL is not actually context free. This is
   * because there are constraints on the linear use of
   * variables. Therefore, we must make an additional check, after
   * parsing, to determine whether the expression is actually well-formed.
   */
  def wellFormed(
    rllExpr : RLLExpr,
    vctxt : Set[FormalExpr]
  ) : Boolean

  def fstOccurs(
    lvars : List[FormalExpr],
    fml : FormalExpr
  ) : Int = {
    fml match {
      case t : Transcription => {
	lvars.indexWhere(
	  ( lfml : FormalExpr ) => {
	    lfml match {
	      case lt : Transcription => {
		lt.rllexpr_.equals( t.rllexpr_ )
	      }
	      case _ => false
	    }
	  }
	)
      }
      case a : AtomLiteral => {
	lvars.indexWhere(
	  ( lfml : FormalExpr ) => {
	    lfml match {
	      case la : AtomLiteral => {
		la.ident_.equals( a.ident_ )
	      }
	      case _ => false
	    }
	  }
	)
      }
      case _ => {
	throw new Exception( "Unexpected fml identifier type" )
      }
    }    
  }

  def compile(
    rllExpr : RLLExpr,
    machine : MACHINE,
    lvars : List[FormalExpr],
    vctxt : Set[FormalExpr],
    ctxt : Ctxt
  ) : ( MACHINE, Ctxt ) = {
    val ( tmstate, fctxt ) = 
      compile(
	rllExpr,
	asTMState( machine ),
	lvars,
	vctxt,
	ctxt
      )
    ( asMachine( tmstate ), fctxt )
  }

  def compile(
    rllExpr : RLLExpr,
    tmstate : TMState,
    lvars : List[FormalExpr],
    vctxt : Set[FormalExpr],
    ctxt : Ctxt
  ) : ( TMState, Ctxt ) = {
    rllExpr match {
      case ap : Application => {
	// TBD
	( tmstate, ctxt )
      }
      case sep : Separation => {
	val ( tstate, tctxt ) = 
	  compile(
	    sep.rllexpr_1,
	    tmstate,
	    lvars,
	    vctxt,
	    ctxt
	  )
	val ( ustate, uctxt ) = 
	  compile(
	    sep.rllexpr_2,
	    tmstate,
	    lvars,
	    vctxt,
	    ctxt
	  )
	val code = 
	  (
	    tstate.code
	    ++ ustate.code
	    ++ List( new PAIR( "PAIR" ) )
	  )
	
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case incl : Inclusion => {
	// TBD
	( tmstate, ctxt )
      }
      case abs : Abstraction => {	
	
	( tmstate, ctxt )
      }
      case inl : InjectionLeft => {
	// TBD
	( tmstate, ctxt )
      }
      case inr : InjectionRight => {
	// TBD
	( tmstate, ctxt )
      }
      case dur : Duration => {
	// TBD
	( tmstate, ctxt )
      }
      case dtor : Deconstruction => {
	// TBD
	( tmstate, ctxt )
      }
      case sel : Selection => {
	// TBD
	( tmstate, ctxt )
      }
      case mntn : Mention => {	
	val tls =
	  (
	    for( i <- 1 to fstOccurs( lvars, mntn.formalexpr_ ) )
	    yield { new TAIL( "TL" ) }
	  );
	val code =
	  (
	    List( new PUSHENV( "PUSHENV" ) )
	    ++ tls.toList
	    ++ List( new HEAD( "HD" ) )
	  );
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case vl : SynVal => {
	// TBD
	( tmstate, ctxt )
      }
    }
  }
}