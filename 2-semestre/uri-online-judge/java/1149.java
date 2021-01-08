import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int n = entrada.nextInt();
        
        if (n <= 0) {
            while (n <= 0) {
                n = entrada.nextInt();
            }
        }
        
        int total = 0;
        
        for (int i = 1; i <= n; i++) {
            total += a;
            a++;
        }
        
        System.out.printf("%d\n", total);
    }
}
