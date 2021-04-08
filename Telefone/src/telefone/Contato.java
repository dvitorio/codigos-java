package telefone;

import java.util.Scanner;

public class Contato {
    private String nome;
    private int numero;
    private boolean comercial;
    
    public Contato(String nome, int numero, boolean comercial){
        this.nome = nome;
        this.numero = numero;
        this.comercial = comercial;
    }
    
    public Contato(){
        
    }
    
    public void adicionarContato(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome do contato a ser adicionado: ");
        String name = tc.nextLine();
        
    }
    
    public void excluirContato(){
        
    }
    
    public void exibirNumero(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean SetComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }
    
    
   
}
