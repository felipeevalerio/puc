import java.util.Scanner;

class ex01{
  public static void main(String[] args){
    StringPalindromo string = new StringPalindromo();
    Scanner ent = new Scanner(System.in);
    String stringEnt;
    while((!(stringEnt = ent.nextLine()).equals("FIM"))){
      boolean palindromo = string.isPalindromo(stringEnt);
      System.out.println(palindromo ? "SIM" : "NAO");    
    }  
    ent.close();
  }
  
}

class StringPalindromo{
  String stringEnt;
  boolean isPalindromo(String stringEnt ){
    String invertida = "";
    for(int i = stringEnt.length() - 1; i >= 0; i--){
      invertida += stringEnt.charAt(i);
    }
    if(stringEnt.equals(invertida.toString())){
      return true;
    }else{
      return false;
    }

  }
}