import java.util.Queue;

public class Questao01 {
  public static void main(String[] args) throws Exception {

  }
}

class Lista {
  private CCelula primeiro, ultimo;

  public Lista() {
    primeiro = new CCelula();
    ultimo = primeiro;
  }

  public void insereAntesDe(Object ElementoAInserir, Object Elemento) {
    boolean achouCelula = false;
    CCelula aux = primeiro; // Celula Cabeça
    while (aux.prox != null && !achouCelula) {
      achouCelula = aux.prox.item.equals(Elemento); // Celula Elemento
      if (achouCelula) {
        aux.prox = new CCelula(ElementoAInserir, aux.prox);
      } else {
        aux = aux.prox;
      }
    }

  }

  public void insereDepoisDe(Object ElementoAInserir, Object Elemento) {
    boolean achouCelula = false;
    CCelula aux = primeiro;
    while (aux.prox != null && !achouCelula) {
      achouCelula = aux.prox.item.equals(Elemento); // Celula Elemento
      if (achouCelula) {
        aux.prox.prox = new CCelula(ElementoAInserir); // Prox da celula elemento
      } else {
        aux = aux.prox;
      }
    }
    if (ultimo != null) {
      ultimo = ultimo.prox;
    }
  }

  public void insereOrdenado(int ElementoAInserir) {
    CCelula aux = primeiro; // CELULA PRIMEIRO APOTANTO ITEM PARA NULL E PROX PARA NULL
    while (aux.prox != null && (int) aux.prox.item <= ElementoAInserir) {
      aux = aux.prox;
    }
  }

  public void insereArray() {
  }
}
