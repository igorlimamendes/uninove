package aula_java_01;

import java.util.Scanner;

public class Aula_Java_01 {

    public static void main(String[] args) {
        // Inteiro
        int a, b, x;
        
        Scanner entrada = new Scanner(System.in);
        
        // System.out.print("Digite o valor de A: ");
        a = entrada.nextInt();
        
        // System.out.print("Digite o valor de B: ");
        b = entrada.nextInt();
        
        x = a + b;
        
        // System.out.printf("X = %d\n", x);
        System.out.println("X = " + x);
    }
    
}
