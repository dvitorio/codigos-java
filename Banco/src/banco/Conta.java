package banco;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private float saldo;
    private String data;
    
    public Conta(String titular, int numero, String agencia, float saldo, String data){ 
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data = data;
    }
    
    public Conta(){
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    public void saca(float valor){
        if(saldo  >= valor){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso! ");
        }
        else{
            System.out.println("Saque não permitido por insuficiência de saldo.");
        }
    }
    
    public void deposita(float valor){
        saldo = saldo + valor;
        System.out.println("Depósito realizado com sucesso! ");
    }
    
    public void calculaRendimento(){
        float rendimento;
        rendimento = saldo * 0.1f;
        System.out.println("Rendimento do período: R$" + rendimento);
    }
    
    public void status(){
        System.out.println("--------------------------------------------");
        System.out.println("             DADOS DO CORRENTISTA           ");
        System.out.println("--------------------------------------------");
        System.out.println("Titutar:..................... " + this.titular);
        System.out.println("Número da conta:............. " + this.numero);
        System.out.println("Agência:..................... " + this.agencia);
        System.out.println("Saldo:....................... " + "R$ " + this.saldo);
        System.out.println("Rendimento:.................. " + "R$ " + (0.1 * this.saldo));
        System.out.println("Data de abertura da conta:...." + this.data);
        System.out.println("---------------------------------------------");
    }

}
