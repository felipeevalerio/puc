import java.util.Scanner;

public class ex05 {
  public static boolean respostaVogais = true;
  public static boolean respostaConsoante = true;
  public static boolean respostaNumeroInteiro = true;
  public static boolean respostaNumeroFloat = true;
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    String string;
    while((!(string = ent.nextLine()).equals("FIM"))) {
      somenteVogais(string);
      somenteConsoantes(string);
      numeroInteiro(string);
      numeroReal(string);

      System.out.println(respostaVogais ? "SIM": "NAO");
      System.out.println(respostaConsoante ? "SIM": "NAO");
      System.out.println(respostaNumeroInteiro ? "SIM": "NAO");
      System.out.println(respostaNumeroFloat ? "SIM": "NAO");

    }
    ent.close();
          
  }

  public static void somenteVogais(String string) {

    for (int i = 0; i <= string.length() - 1; i++) {
      if (string.charAt(i) != 'A' && string.charAt(i) != 'a' && string.charAt(i) != 'E' && string.charAt(i) != 'e'
          && string.charAt(i) != 'I' && string.charAt(i) != 'i' && string.charAt(i) != 'O' && string.charAt(i) != 'o'
          && string.charAt(i) != 'U' && string.charAt(i) != 'u') {

        respostaVogais = false;
      }
    }
  }

  public static void somenteConsoantes(String string) {
    for (int i = 0; i <= string.length() - 1; i++) {

    if (string.charAt(i) <= (char) 65 || string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I'
        || string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == '['
        || string.charAt(i) == (char) 92 || string.charAt(i) >= (char) 122 && string.charAt(i) == ']'
        || string.charAt(i) == '^' || string.charAt(i) == '_' || string.charAt(i) == '`' || string.charAt(i) == 'a'
        || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {

      respostaConsoante = false;
    }
  }
  }

  public static void numeroInteiro(String string){
    for(int i = 0; i < string.length() - 1;i++){
      if(string.charAt(i) < '0' || string.charAt(i) > '9' ){
        respostaNumeroInteiro = false;
      }
    }
  }

  public static void numeroReal(String string){
    respostaNumeroFloat = string.matches("[-+]?[0-9]*\\.?[0-9]+");
  }
}
