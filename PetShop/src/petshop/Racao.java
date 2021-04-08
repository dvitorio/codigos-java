package petshop;

import javax.swing.JOptionPane;

public class Racao {
    private String marca;
    private int qtde;
    private float preco;
    private String tipo[] = {"Peixe", "Gato", "Cão", "Pássaro", "Outros"};
    
    public Racao(String marca, int qtde, float preco) {
        this.marca = marca;
        this.qtde = qtde;
        this.preco = preco;
        
    }
    
    public Racao(){
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrarMarca(){
        String resposta;
        marca = JOptionPane.showInputDialog("Digite a marca do produto: ");
        JOptionPane.showMessageDialog(null, "Marca do produto: \n" + marca);
        resposta = JOptionPane.showInputDialog("Qual o tipo do produto? ");
        JOptionPane.showMessageDialog(null, "Tipo a ser cadastrado: \n" + tipo);
            
        
    }
    
    public void devolverProduto(){
        
    } 
    
    
}

