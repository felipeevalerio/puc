class Main {
  public static void main(String[] args) throws Exception {
    CFila fila = new CFila();
    Object x;
    fila.enfileira(4);
    fila.enfileira(5);
    fila.enfileira(2);

    fila.mostra();
    x = fila.desemfilieira();
    System.out.println(x);
    fila.mostra();
  }
}

public class CFila {
  private CCelula frente;
  private CCelula tras;
  private int qntd;

  public CFila() {
    this.frente = new CCelula();
    this.tras = this.frente;
  }

  public boolean vazia() {
    return frente == tras;
  }

  public void enfileira(Object valorItem) {
    tras.prox = new CCelula(valorItem);
    tras = tras.prox;
    qntd++;
  }

  public Object desemfilieira() {
    if (frente != tras) {
      frente = frente.prox;
      qntd--;
      return frente.item;
    }
    return null;
  }

  public void mostra() {
    System.out.print("[");
    for (CCelula c = frente.prox; c != null; c = c.prox) {
      System.out.print(c.item + " ");
    }
    System.out.println("]");
  }

  public Object peek() {
    if (frente != tras) {
      return frente.prox.item;
    } else {
      return null;
    }
    // return (frente != tras) ? frente.prox.item : null;

  }

  public boolean contem(Object valorItem) {
    for (CCelula aux = frente.prox; aux != null; aux = aux.prox) {
      if (aux.item.equals(valorItem))
        return true;
    }
    return false;
  }

}
