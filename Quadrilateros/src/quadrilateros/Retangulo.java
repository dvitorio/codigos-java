package quadrilateros;

public class Retangulo {
    private float base;
    private float altura;
    
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    public Retangulo(){
        
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea(float base, float altura){
        float area = base * altura;
        System.out.println("Área do retângulo: " + area + " m²");
        return area;
    }
    
    public float calcularPerimetro(float base, float altura){
        float perimetro = (2 * base) + (2 * altura);
        System.out.println("Perímetro do retângulo: " + perimetro + " m");
        return perimetro;
    }
    
}
