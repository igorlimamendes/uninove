import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();

        int f1 = 0, f2 = 1, f3 = 0;

        if (n == 1) {
            System.out.printf("%d\n", f1);
        } else if (n == 2) {
            System.out.printf("%d %d\n", f1, f2);
        } else if (n >= 3) {
            System.out.printf("%d %d ", f1, f2);
            
            for (int i = 2; i < n; i++) {
                f3 = f1 + f2;
                if (i+1 != n) System.out.printf("%d ", f3);
                else System.out.printf("%d\n", f3);
                f1 = f2;
                f2 = f3;
            }
        }
    }
}
