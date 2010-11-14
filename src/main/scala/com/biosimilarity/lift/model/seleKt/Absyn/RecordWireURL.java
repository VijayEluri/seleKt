package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class RecordWireURL extends WireURL {
  public final URL url_;

  public RecordWireURL(URL p1) { url_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.WireURL.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL) {
      com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL x = (com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL)o;
      return this.url_.equals(x.url_);
    }
    return false;
  }

  public int hashCode() {
    return this.url_.hashCode();
  }


}