package carro;

public class Carro {

    public static void main(String[] args) {
        Motor m1 = new Motor();
        m1.setRotacao(1500);
        m1.setFabricante("Volkswagen");
        m1.setVoltagem(127);
        m1.setLigado(true);
        m1.verificaVelocidade(240);
        m1.mostrarDados();
     
        
        Motor m2 = new Motor();
        m2.setRotacao(870);
        m2.setFabricante("Chevrolet");
        m2.setVoltagem(220);
        m2.setLigado(false);
        m2.verificaVelocidade(120);
        m2.mostrarDados();
        
        
    }
    
}
