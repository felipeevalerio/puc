public class Pessoa{
    private String nome;
    private String sexo;
    private double peso;
    private double altura;
    private double imc;
    private String categoriaIMC;

    public Pessoa(){};

    public Pessoa(String nome, String sexo, double peso,double altura){
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    };

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double kg){
        if(kg <= 0){
            System.out.println("Peso não pode ser negativo.");
        }else{
            this.peso = kg;   
        }
    }

    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double metros){
        if(metros <= 0){
            System.out.println("Metros não pode ser negativo.");
        }else{
            this.altura = metros;   
        }
    }

    private double calcIMC(double kg, double metros){
        double calc = kg / (metros * metros); 
        return calc;
    }

    private String verifyIMC(){
        this.imc = calcIMC(this.peso,this.altura);
        
        if(imc > 16 && imc < 18.5){
            this.categoriaIMC = "Subpeso"; 
        } else if (imc >= 18.5 && imc < 25 ){
            this.categoriaIMC = "Peso Normal";
        } else if (imc >= 25 && imc < 40){
            this.categoriaIMC = "Sobrepeso";
        } else{
            this.categoriaIMC = "Categoria inexistente";
        }

        return this.categoriaIMC;
    }
    
    public void showInfo(){
        String categoria = verifyIMC();
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: " + this.imc);
        System.out.println("Categoria: " + categoria);

    }
}