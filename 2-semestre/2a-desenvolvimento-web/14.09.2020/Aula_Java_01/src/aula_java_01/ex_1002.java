package aula_java_01;

import java.util.Scanner;

public class ex_1002 {
    public static void main(String[] args) {
        // real = float
        double raio, area;
        
        Scanner entrada = new Scanner(System.in);
        
        raio = entrada.nextDouble();
        
        area = 3.14159 * (raio * raio);
        
        System.out.printf("A= %.4f\n", area);
    }
}
