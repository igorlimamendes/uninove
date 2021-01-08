import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int a, b, maior;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        maior = (a+b+Math.abs(a - b)) / 2;
        
        if (maior == a) {
            if (a % b == 0) System.out.printf("Sao Multiplos\n");
            if (a % b != 0) System.out.printf("Nao sao Multiplos\n");
        } else {
            if (b % a == 0) System.out.printf("Sao Multiplos\n");
            if (b % a != 0) System.out.printf("Nao sao Multiplos\n");
        }
    }
}
