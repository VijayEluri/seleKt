package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class MentionLCtxt extends RLambdaLCtxt {
  public final FormalLCtxt formallctxt_;

  public MentionLCtxt(FormalLCtxt p1) { formallctxt_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt) {
      com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt x = (com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt)o;
      return this.formallctxt_.equals(x.formallctxt_);
    }
    return false;
  }

  public int hashCode() {
    return this.formallctxt_.hashCode();
  }


}