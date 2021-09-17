import java.util.Scanner;

public class ex03 {
  public static void main(String[] args){
    Scanner ent = new Scanner(System.in);
    String string;
    while((!(string = ent.nextLine()).equals("FIM"))){
      criptografaPalavra(string);
    }
    ent.close();

  }

  public static void criptografaPalavra(String string){
    int ascii = 0;
    String novaPalavra="";
    for(int i = 0; i < string.length(); i++){
      ascii = (int) string.charAt(i) + 3;
      novaPalavra += (char)ascii;
    }
    System.out.println(novaPalavra);
  }
}
