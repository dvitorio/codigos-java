package subtotais;

import java.util.Scanner;

public class SubTotais {

    public static void main(String[] args) { 
        
        float preco[] = new float[5];
        int i, quantidade;
        float total = 0;
        float subtotal = 0;    
        
        for(i=0; i<5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantidade do produto: ");
            quantidade = sc.nextInt();
            System.out.println("Preço do produto: ");
            preco[i] = sc.nextFloat();
            total = preco[i] * quantidade;
            subtotal = subtotal + total;
            System.out.println("Subtotal = R$" + subtotal);
        }
        System.out.println("Total da compra: R$" + total);
        
    } 
}
