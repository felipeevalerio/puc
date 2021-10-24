class x {
  public static void main(String[] args) {
    CLista l = new CLista();
    l.insereInicio(3);
    l.insereInicio(5);
    l.insereInicio(9);
    l.insereAntes(20, 3);
    l.mostrar();
    int x = l.retornaIndice(20);
    System.out.println(x);
    l.insereIndice(7, 2);
    l.mostrar();
    l.removeValor(5);
    l.mostrar();
    l.removeIndice(2);
    l.mostrar();
    System.out.println("INSERIR ANTES");
    l.insereAntesDe(4, 7);
    l.mostrar();
    l.insereDepoisDe(6, 4);
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

  public int retornaIndice(Object valorItem) {
    int i = 0;
    for (CCelula c = primeira.prox; c != null; c = c.prox) {
      if (c.item.equals(valorItem))
        return i;
      i++;
    }
    return i;
  }

  public void insereIndice(Object valorItem, int index) {
    int i = 0;
    for (CCelula c = primeira.prox; c != null && i < index; c = c.prox, i++) {
      if (i + 1 == index) {
        c.prox = new CCelula(valorItem, c.prox);
      }
    }
  }

  public boolean contem(Object valorItem) {
    boolean achou = false;
    for (CCelula c = primeira.prox; c != null && !achou; c = c.prox) {
      achou = c.item.equals(valorItem);
    }
    return achou;
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

  public Object retornaPrimeiro() {
    return (primeira != ultima) ? primeira.prox.item : null;
  }

  public Object retornaUltima() {
    return ultima.item;
  }

  public Object retornaRemoveComecoLogica() {
    if (primeira != ultima) {
      primeira = primeira.prox;
      qntd--;
      return primeira.item;
    }
    return null;
  }

  public Object retornaRemoveComecoFisica() {
    if (primeira != ultima) {
      CCelula c = primeira.prox; // Primeira célula de fato
      primeira.prox = c.prox; // primeira.prox.prox
      if (primeira.prox == null)
        ultima = primeira;
      qntd--;
      return c.item;
    }
    return null;
  }

  public Object retornaRemoveFim() {
    if (primeira != ultima) {
      CCelula aux = primeira;
      while (aux.prox != ultima)
        aux = aux.prox;

      CCelula aux2 = aux.prox;
      ultima = aux;
      ultima.prox = null;
      qntd--;
      return aux2.item;
    }
    return null;
  }

  public void removeValor(Object valorItem) {
    boolean achou = false;
    for (CCelula c = primeira.prox; c != null && !achou; c = c.prox) {
      if (c.prox.item.equals(valorItem)) {
        c.prox = c.prox.prox;
        achou = true;
      }
    }
  }

  public void removeIndice(int index) {
    int i = 0;
    for (CCelula c = primeira.prox; c != null && i < index; c = c.prox, i++) {
      if (i + 1 == index) {
        c.prox = c.prox.prox;
      }
    }
  }

  public void insereAntesDe(Object ElementoAInserir, Object Elemento) {
    boolean achou = false;
    for (CCelula c = primeira.prox; c != null && !achou; c = c.prox) {
      if (c.prox.item.equals(Elemento)) {
        c.prox = new CCelula(ElementoAInserir, c.prox);
        achou = true;
      }
    }
  }

  public void insereDepoisDe(Object ElementoAInserir, Object Elemento) {
    boolean achou = false;
    for (CCelula c = primeira.prox; c != null && !achou; c = c.prox) {
      if (c.item.equals(Elemento)) {
        c.prox = new CCelula(ElementoAInserir, c.prox);
        achou = true;
        if (c.prox == null) {
          ultima = c.prox;
        }
      }
    }
  }

}
