package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class TranscriptPCtxt extends FormalPCtxt {
  public final RLambdaPCtxt rlambdapctxt_;

  public TranscriptPCtxt(RLambdaPCtxt p1) { rlambdapctxt_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt) {
      com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt x = (com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt)o;
      return this.rlambdapctxt_.equals(x.rlambdapctxt_);
    }
    return false;
  }

  public int hashCode() {
    return this.rlambdapctxt_.hashCode();
  }


}