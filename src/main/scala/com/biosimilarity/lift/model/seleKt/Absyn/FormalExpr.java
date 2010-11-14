package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public abstract class FormalExpr implements java.io.Serializable {
  public abstract <R,A> R accept(FormalExpr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Transcription p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral p, A arg);

  }

}