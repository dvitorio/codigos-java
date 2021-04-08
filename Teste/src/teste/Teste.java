package teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        float notas[] = new float[10];
        float soma = 0;
        float media = 0;
        
        for(int i = 0; i<10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a nota " + i);
            notas[i] = sc.nextFloat();
            soma = notas[i] + soma;
            media = soma/10;
        }
        System.out.println("Média das notas: " + media);
    }
}
