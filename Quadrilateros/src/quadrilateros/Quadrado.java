package quadrilateros;

public class Quadrado {
    private float lado;
    
    public Quadrado(float lado){
        this.lado = lado;
    }
    
    public Quadrado(){
        
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
    public float calcularArea(float lado){
        float area = lado * lado;
        System.out.println("Área do quadrado: " + area + " m²");
        return area;
    }
    
    public float calcularPerimetro(float lado){
        float perimetro = 4 * lado;
        System.out.println("Perímetro do quadrado: " + perimetro + " m");
        return perimetro;
    }
    
}
