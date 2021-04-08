package quadrilateros;

public class Quadrilateros {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        System.out.println("-------------------------------");
        q1.calcularArea(5.4f);
        q1.calcularPerimetro(6.3f);
        System.out.println("-------------------------------");
        
        Quadrado q2 = new Quadrado();
        q2.calcularArea(10.3f);
        q2.calcularPerimetro(14f);
        System.out.println("-------------------------------");
        
        Retangulo r1 = new Retangulo();
        System.out.println("-------------------------------");
        r1.calcularArea(7.25f, 4.3f);
        r1.calcularPerimetro(7f, 8f);
        System.out.println("-------------------------------");
        
        Losango l1 = new Losango();
        System.out.println("-------------------------------");
        l1.calcularArea(23f, 18f);
        System.out.println("-------------------------------");
        
    }
    
}
