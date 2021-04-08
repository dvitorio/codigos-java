package loja;

public class Fatura {
    
    private String item;
    private int codItem;
    private int qtdItem;
    private double precoItem;
    private double total;
    
    public Fatura(String item, int codItem, int qtdItem, double precoItem, double total){
        this.item = item;
        this.codItem = codItem;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
        this.total = total;
    }
    
    public Fatura(){
        
    }
    public String getItem(){
        return item;
    }
    
    public void setItem(String item){
        this.item = item;
    }
    
    public int getCodItem(){
        return codItem;
    }
    
    public void setCodItem(int codItem){
        this.codItem = codItem;
    }
    
    public int getQtdItem(){
        return qtdItem;
    }
    
    public void setQtdItem(int qtdItem){
        this.qtdItem = qtdItem;
    }
    
    public double getPrecoItem(){
        return precoItem;
    }
    
    public void setPrecoItem(double precoItem){
        this.precoItem = precoItem;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        total = getPrecoItem() * getQtdItem();
        this.total = total;
    }
}
