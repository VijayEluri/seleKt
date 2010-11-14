package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class Application extends RLambdaExpr {
  public final RLambdaExpr rlambdaexpr_;
  public final ListRLambdaExpr listrlambdaexpr_;

  public Application(RLambdaExpr p1, ListRLambdaExpr p2) { rlambdaexpr_ = p1; listrlambdaexpr_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.Application) {
      com.biosimilarity.lift.model.seleKt.Absyn.Application x = (com.biosimilarity.lift.model.seleKt.Absyn.Application)o;
      return this.rlambdaexpr_.equals(x.rlambdaexpr_) && this.listrlambdaexpr_.equals(x.listrlambdaexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.rlambdaexpr_.hashCode())+this.listrlambdaexpr_.hashCode();
  }


}