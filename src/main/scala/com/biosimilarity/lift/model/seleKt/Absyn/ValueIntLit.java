package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class ValueIntLit extends ValueLiteral {
  public final Integer integer_;

  public ValueIntLit(Integer p1) { integer_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit) {
      com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit x = (com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}