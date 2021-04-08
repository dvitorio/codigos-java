package carro;

public class Motor {
    private int rotacao;
    private String fabricante;
    private int voltagem;
    private boolean ligado;
    
    public Motor(){
        
    }

    public int getRotacao() {
        return rotacao;
    }

    public void setRotacao(int rotacao) {
        this.rotacao = rotacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    public boolean ligaMotor(boolean ligado){
        if(this.ligado == true){
            System.out.println("Motor ligado\n");
            return ligado;
        }
        else{
            System.out.println("Motor desligado\n");
            return ligado;
        }
    }
    
    public boolean desligaMotor(boolean desligado){
        if(this.ligado == true){
            System.out.println("Motor desligado!");
            return desligado;
        }
        else{
            System.out.println("Motor ligado!\n");
            return desligado;
        }
    }
    
    public int verificaVelocidade(int velocidade){
        if(ligado == true){
            System.out.println("Este motor está ligado e com rotação de " + rotacao + " RPM\n");
            return velocidade;
        }
        else{
            System.out.println("Este motor está desligado e sem rotação.\n");
            velocidade = 0;
            return velocidade;
        }
    }
    
    public void mostrarDados(){
        System.out.println("------------ DADOS DO MOTOR ------------");
        System.out.println("Fabricante:.................. " + this.fabricante);
        System.out.println("Voltagem:.................... " + this.voltagem + " V");
        System.out.println("Velocidade:.................. " + this.rotacao + " RPM");
        System.out.println("Ligado:...................... " + this.ligado);
        System.out.println("----------------------------------------");
    }
    
}
