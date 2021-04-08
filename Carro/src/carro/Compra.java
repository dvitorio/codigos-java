package carro;

public class Compra extends Motor {

    public Compra() {
        Motor m1 = new Motor();
    }
    
    public int aumentarVelocidade(int speed){
        if(getLigado() == true){
            setRotacao(200);
            return speed;
        }
        else{
            System.out.println("Velocidade não pode ser aumentada. Motor desligado.");
            return speed;
        }
    }
}
