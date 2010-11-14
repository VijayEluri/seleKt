package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class BasicURL extends URL {
  public final URLScheme urlscheme_;
  public final URLPath urlpath_;

  public BasicURL(URLScheme p1, URLPath p2) { urlscheme_ = p1; urlpath_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.URL.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.BasicURL) {
      com.biosimilarity.lift.model.seleKt.Absyn.BasicURL x = (com.biosimilarity.lift.model.seleKt.Absyn.BasicURL)o;
      return this.urlscheme_.equals(x.urlscheme_) && this.urlpath_.equals(x.urlpath_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.urlscheme_.hashCode())+this.urlpath_.hashCode();
  }


}