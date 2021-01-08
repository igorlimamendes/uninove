import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int x, s;

        for (int i = 0; i < n; i++) {
            x = entrada.nextInt();

            s = 0;

            for (int j = 1; j < x; j++) {
                if (x % j == 0) s += j;
            }

            if (s == x) System.out.printf("%d eh perfeito\n", x);
            else System.out.printf("%d nao eh perfeito\n", x);
        }
    }
}
