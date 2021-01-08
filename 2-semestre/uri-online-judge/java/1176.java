import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
    
        int t = entrada.nextInt(), n;

        for (int i = 0; i < t; i++) {
            n = entrada.nextInt();

            long f1 = 0, f2 = 1, f3 = 0;

            if (n == 0) {
                System.out.printf("Fib(%d) = %d\n", n, f1);
            } else if (n == 1) {
                System.out.printf("Fib(%d) = %d\n", n, f2);
            } else if (n >= 2) {
                for (int j = 2; j <= n; j++) {
                    f3 = f1 + f2;
                    if (j == n) System.out.printf("Fib(%d) = %d\n", n, f3);
                    f1 = f2;
                    f2 = f3;
                }
            }
        }
    }
}
