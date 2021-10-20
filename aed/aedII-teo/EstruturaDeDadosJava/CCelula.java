public class CCelula {
  public Object item;
  public CCelula prox;

  public CCelula() {
    this.item = null;
    this.prox = null;
  };

  public CCelula(Object item) {
    this.item = item;
    this.prox = null;
  };

  public CCelula(Object item, CCelula prox) {
    this.item = item;
    this.prox = prox;
  }

}