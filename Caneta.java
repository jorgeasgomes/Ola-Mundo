package aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo" + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Uma Caneta" + this.cor);
        System.out.println(" está tampanda?"+ this.tampada);
        System.out.println("tchau");
    }
    
    void rabiscar(){
        if(this.tampada == true) {
            System.out.println("Erro. estou tampada e  não posso rabiscar");
        } else { 
            System.out.println("Estou rabiscando");
        }
    
    }
    
    void tampar(){
        this.tampada = true;
    
    }
    
    void destampar(){
        this.tampada = false;
    
    }
    
    
    
}
