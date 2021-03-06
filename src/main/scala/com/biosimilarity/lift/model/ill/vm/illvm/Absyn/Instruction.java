package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public abstract class Instruction implements java.io.Serializable {
  public abstract <R,A> R accept(Instruction.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.PUSHENV p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.HEAD p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.TAIL p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.RET p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.PUSH p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.POP p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.MAKEFCL p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.AP p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.UNIT p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.UNUNIT p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.PAIR p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.UNPAIR p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.MAKECCL p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.FST p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.SND p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.INL p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.INR p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.CASE p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.MAKEOCL p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.READ p, A arg);
    public R visit(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.DUP p, A arg);

  }

}
