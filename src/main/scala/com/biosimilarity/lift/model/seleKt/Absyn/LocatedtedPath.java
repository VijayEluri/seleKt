package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class LocatedtedPath extends URLPath {
  public final URLLocation urllocation_;
  public final URLRelativePath urlrelativepath_;

  public LocatedtedPath(URLLocation p1, URLRelativePath p2) { urllocation_ = p1; urlrelativepath_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.URLPath.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath) {
      com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath x = (com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath)o;
      return this.urllocation_.equals(x.urllocation_) && this.urlrelativepath_.equals(x.urlrelativepath_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.urllocation_.hashCode())+this.urlrelativepath_.hashCode();
  }


}