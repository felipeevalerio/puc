import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Televisao tv = new Televisao();
        int opt = 1;

        System.out.println("Qual a quantidade de canais?");
        tv.setCanaisMax(ent.nextInt());
        System.out.println("Qual o limite de volume");
        tv.setVolumeMax(ent.nextInt());

        while(opt == 1){
            int choice;

            System.out.println("\n[1] Ligar");
            System.out.println("[2] Aumentar Volume");
            System.out.println("[3] Diminuir Volume");
            System.out.println("[4] Trocar de canal");
            System.out.println("[5] Trocar para canal específico");
            System.out.println("[6] Verificar Canal");
            System.out.println("[7] Verificar Volume\n");
            
            choice = ent.nextInt();
            
            switch(choice){
                case 1:
                    tv.isLigada();
                    break;
                case 2:
                    tv.aumentaVolume();
                    break;
                case 3:
                    tv.diminuiVolume();
                    break;
                case 4:
                    tv.trocaCanal();
                    break;
                case 5:
                    System.out.println("Digite o canal desejado:");
                    tv.trocaCanal(ent.nextInt());
                    break;

                case 6:
                    tv.getCanal();
                    break;

                case 7:
                    tv.getVolume();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            
        }
        ent.close();
    }
}