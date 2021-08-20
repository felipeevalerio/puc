public class Carro{
    private double velocidadeTotal;
    private int ano;
    private String cor;

    public int getAno(){
        return ano;
    }

    public int setAno(int ano){
        if(ano > 2021){
            System.out.println("Ano Inválido.");
            return this.ano = 2021;
        }

        return this.ano = ano;
    }

    public String getCor(){
        return cor;
    }

    public String setCor(String cor){
        return this.cor = cor;
    }

    public double getVelocidadeTotal(){
        return velocidadeTotal;
    }

    public double setVelocidadeTotal(double velocidade){
        return this.velocidadeTotal = velocidade;
    }

}