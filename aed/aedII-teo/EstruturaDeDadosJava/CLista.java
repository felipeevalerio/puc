class x {
  public static void main(String[] args) {
    CLista l = new CLista();
    l.insereInicio(3);
    l.insereInicio(5);
    l.insereInicio(9);
    l.mostrar();
    l.insereAntes(20, 3);
    l.mostrar();

  }
}

public class CLista {
  private CCelula primeira;
  private CCelula ultima;
  private int qntd;

  public CLista() {
    this.primeira = new CCelula();
    this.ultima = primeira;
  }

  public boolean vazia() {
    return primeira == ultima;
  }

  public void insereInicio(Object valor) {
    primeira.prox = new CCelula(valor, primeira.prox);
    if (primeira.prox.prox == null)
      ultima = primeira.prox;
    qntd++;
  }

  public void insereFim(Object valor) {
    ultima.prox = new CCelula(valor);
    ultima = ultima.prox;
    qntd++;
  }

  public void insereAntes(Object valorItem, Object valorATrocar) {
    boolean achou = false;
    for (CCelula c = primeira.prox; c != null && !achou; c = c.prox) {
      if (c.prox.item.equals(valorATrocar)) {
        c.prox = new CCelula(valorItem, c.prox);
        achou = true;
      }
    }
  }

  public void mostrar() {
    System.out.print("[");
    for (CCelula c = primeira.prox; c != null; c = c.prox) {
      System.out.print(c.item + " ");
    }
    System.out.println("]");
  }

  public int quantidade() {
    return qntd;
  }
}
