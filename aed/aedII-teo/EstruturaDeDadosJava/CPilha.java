public class CPilha {
  private CCelula topo = null;
  private int qntd;

  public boolean vazia() {
    return topo == null;
  }

  public void empilha(Object valorItem) {
    topo = new CCelula(valorItem, topo);
    qntd++;
  }

  public Object desempilha() {
    Object item = null;
    if (topo != null) {
      item = topo.item;
      topo = topo.prox;
      qntd--;
    }
    return item;
  }

  public void mostra() {
    System.out.print("[");
    for (CCelula c = topo; c != null; c = c.prox) {
      System.out.print(c.item + " ");
    }
    System.out.print("]");
  }

  public boolean contem(Object valor) {
    if (topo != null) {
      for (CCelula c = topo; c != null; c = c.prox) {
        if (c.item.equals(valor))
          return true;
      }
    }
    return false;
  }

  public Object peek() {
    return (topo != null) ? topo.item : null;
  }

  public int quantidade() {
    return qntd;
  }

}