import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {
            double n = entrada.nextDouble();

            if (n <= 10) System.out.printf("A[%d] = %.1f\n", i, n);
        }
    }
}
