import java.util.Random;
import java.util.Scanner;

public class ex04{
  public static void main(String[] args){
    Random gerador = new Random();
  
    gerador.setSeed(4);
    
    Scanner ent = new Scanner(System.in);
    String string ="";
    char char1 = ( char )('a' + (Math.abs( gerador.nextInt( )) % 26 ));
    char char2 = ( char )('a' + (Math.abs( gerador.nextInt( )) % 26 ));
    while((!(string = ent.nextLine()).equals("FIM"))){
      System.out.println(string.replace(char1,char2));
    }
    ent.close();
  }
}
