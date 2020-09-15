package aula_java_01;

import java.util.Scanner;

public class ex_1003 {
    public static void main(String[] args) {
        int a, b, soma;
        
        Scanner leia = new Scanner(System.in);
        
        a = leia.nextInt();
        b = leia.nextInt();
        
        soma = a + b;
        
        System.out.printf("SOMA = %d\n", soma);
    }
}
