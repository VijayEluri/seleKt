package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class URLNetLocation extends URLLocation {
  public final URLRoot urlroot_;
  public final URLRsrcLocation urlrsrclocation_;

  public URLNetLocation(URLRoot p1, URLRsrcLocation p2) { urlroot_ = p1; urlrsrclocation_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.URLLocation.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation) {
      com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation x = (com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation)o;
      return this.urlroot_.equals(x.urlroot_) && this.urlrsrclocation_.equals(x.urlrsrclocation_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.urlroot_.hashCode())+this.urlrsrclocation_.hashCode();
  }


}