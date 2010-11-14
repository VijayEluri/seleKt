package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public abstract class ValueLiteral implements java.io.Serializable {
  public abstract <R,A> R accept(ValueLiteral.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit p, A arg);

  }

}