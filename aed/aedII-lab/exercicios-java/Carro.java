public class Carro{
    private double velocidadeTotal;
    private int ano;
    private String cor;

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano > 2021 ? 2021 : ano;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getVelocidadeTotal(){
        return velocidadeTotal;
    }

    public void setVelocidadeTotal(double velocidade){
        this.velocidadeTotal = velocidade;
    }

}