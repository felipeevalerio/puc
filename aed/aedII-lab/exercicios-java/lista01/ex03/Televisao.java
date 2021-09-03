public class Televisao {
    private boolean status=false;
    private int volume=1;
    private int canal=1;
    private int volumeMax;
    private int canalMax;

    public void isLigada(){
        this.status = true;
        System.out.println("Tv Ligada");
    }

    public void getCanal(){
        if(this.status) 
            System.out.println("Canal atual => " + this.canal);
        
    }

    public void getVolume(){
        if(this.status) 
            System.out.println("Volume atual => " + this.volume);
        
    }

    public void aumentaVolume(){
        if(this.status && this.volume < this.volumeMax)
            this.volume ++;
    }

    public void diminuiVolume(){
        if(this.status && this.volume > 0)
            this.volume --;
    }


    public void trocaCanal(){
        if(this.status && this.canal < this.canalMax)
            this.canal++;
        else
            canal = 1;

    }

    public void trocaCanal(int canal){
        if(this.status){
            this.canal = canal;
        }
    }

    public void setCanaisMax(int canalMax){
        this.canalMax = canalMax;
    }

    public void setVolumeMax(int volumeMax){
        this.volumeMax = volumeMax;
    }

}
