package quadrilateros;

public class Losango {
    private float diagonalMaior;
    private float diagonalMenor;
    
    public Losango(float D, float d){
        this.diagonalMaior = D;
        this.diagonalMenor = d;
    }
    
    public Losango(){
        
    }

    public float getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(float diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public float getDiagonalmenor() {
        return diagonalMenor;
    }

    public void setDiagonalmenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    
    public float calcularArea(float D, float d){
        float area = (D * d)/2;
        System.out.println("Área do losango: " + area + " m²");
        return area;
    }
    
}
