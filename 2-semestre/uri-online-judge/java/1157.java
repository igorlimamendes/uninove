import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int n;
        
        Scanner entrada = new Scanner(System.in);
        
        n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.printf("%d\n", i);
        }
    }
}
