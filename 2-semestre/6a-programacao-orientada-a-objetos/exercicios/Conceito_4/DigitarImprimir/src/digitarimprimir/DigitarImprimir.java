package digitarimprimir;
import java.util.Scanner;

public class DigitarImprimir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe um número: ");
        int n = entrada.nextInt();
        
        System.out.println("Soma por 5: " + (n + 5));
        System.out.println("Subtração por 7: " + (n - 7));
        System.out.println("Multiplicação por 10: " + (n * 10));
        System.out.println("Divisão por 2: " + (n / 2));
    }    
}
