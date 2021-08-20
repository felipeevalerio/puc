import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Carro gol = new Carro();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o ano do carro:");
        gol.setAno(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Digite a cor do carro");
        
        gol.setCor(entrada.nextLine());

        System.out.println("Digite a velocidade máxima do carro");
        gol.setVelocidadeTotal(entrada.nextDouble());

        System.out.println("\n\n*** Informações do Carro ***\n\n");
        System.out.println("Ano: "+ gol.getAno());
        System.out.println("Cor: "+ gol.getCor());
        System.out.println("Velocidade Máxima: "+ gol.getVelocidadeTotal() + "km/h");

        entrada.close();

    }
}
