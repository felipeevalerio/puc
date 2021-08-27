import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Felipe","Masculino",82,1.86);


        System.out.println("*** Cálculo de IMC ***");
        System.out.println("Digite seu nome:");
        pessoa1.setNome(ent.nextLine());
        System.out.println("Digite seu sexo:");
        pessoa1.setSexo(ent.nextLine());
        System.out.println("Digite seu peso (Kg) :");
        pessoa1.setPeso(ent.nextDouble());
        System.out.println("Digite sua altura (Metros):");
        pessoa1.setAltura(ent.nextDouble());
        
        System.out.println("\n");
        pessoa1.showInfo();

        System.out.println("\n");
        pessoa2.showInfo();

        ent.close();
    }
}
