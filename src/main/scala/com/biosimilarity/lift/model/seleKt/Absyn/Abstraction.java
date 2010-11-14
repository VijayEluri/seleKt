package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class Abstraction extends RLambdaExpr {
  public final ListFormalExpr listformalexpr_;
  public final RLambdaExpr rlambdaexpr_;

  public Abstraction(ListFormalExpr p1, RLambdaExpr p2) { listformalexpr_ = p1; rlambdaexpr_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.Abstraction) {
      com.biosimilarity.lift.model.seleKt.Absyn.Abstraction x = (com.biosimilarity.lift.model.seleKt.Absyn.Abstraction)o;
      return this.listformalexpr_.equals(x.listformalexpr_) && this.rlambdaexpr_.equals(x.rlambdaexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listformalexpr_.hashCode())+this.rlambdaexpr_.hashCode();
  }


}