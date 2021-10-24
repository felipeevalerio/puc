import java.util.Random;

class MainRandomQueue {
  public static void main(String[] args) throws Exception {
    CRandomQueue randomQueue = new CRandomQueue();
    randomQueue.Enqueue(7);
    randomQueue.Enqueue(4);
    randomQueue.Enqueue(9);
    randomQueue.mostrar();
    randomQueue.Dequeue();
    randomQueue.mostrar();
    Object x = randomQueue.Sample();
    System.out.println(x);
  }
}

public class CRandomQueue {
  private CCelula primeira;
  private CCelula ultima;
  private int qntd;

  public CRandomQueue() {
    this.primeira = new CCelula();
    this.ultima = this.primeira;
  }

  public boolean IsEmpty() {
    return primeira == ultima;
  }

  public void Enqueue(Object item) {
    ultima.prox = new CCelula(item);
    ultima = ultima.prox;
    qntd++;
  }

  public Object Dequeue() {
    if (primeira != ultima) {
      int num = getRandomNumber(qntd);
      int index = 0;
      for (CCelula c = primeira.prox; c != null && index < num; index++, c = c.prox) {
        if (index + 1 == num) {
          CCelula aux = c.prox;
          c.prox = c.prox.prox;
          return aux.item;
        }
      }
    }
    return null;
  }

  public Object Sample() {
    if (primeira != ultima) {
      int num = getRandomNumber(qntd);
      int index = 0;
      for (CCelula c = primeira.prox; c != null && index < num; index++, c = c.prox) {
        if (index + 1 == num) {
          return c.prox.item;
        }
      }
    }
    return null;
  }

  private int getRandomNumber(int max) {
    max = qntd;
    Random r = new Random();
    return r.nextInt((max));
  }

  public void mostrar() {
    System.out.print("[");
    for (CCelula c = primeira.prox; c != null; c = c.prox) {
      System.out.print(c.item + " ");
    }
    System.out.println("]");
  }

}
