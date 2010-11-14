package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class URLRsrcPortLoc extends URLRsrcLocation {
  public final NetLocation netlocation_;
  public final Port port_;

  public URLRsrcPortLoc(NetLocation p1, Port p2) { netlocation_ = p1; port_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc) {
      com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc x = (com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc)o;
      return this.netlocation_.equals(x.netlocation_) && this.port_.equals(x.port_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.netlocation_.hashCode())+this.port_.hashCode();
  }


}