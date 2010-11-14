package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class SlashPath extends URLRelativePath {
  public final URLRoot urlroot_;
  public final ListURLPathElement listurlpathelement_;

  public SlashPath(URLRoot p1, ListURLPathElement p2) { urlroot_ = p1; listurlpathelement_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.SlashPath) {
      com.biosimilarity.lift.model.seleKt.Absyn.SlashPath x = (com.biosimilarity.lift.model.seleKt.Absyn.SlashPath)o;
      return this.urlroot_.equals(x.urlroot_) && this.listurlpathelement_.equals(x.listurlpathelement_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.urlroot_.hashCode())+this.listurlpathelement_.hashCode();
  }


}