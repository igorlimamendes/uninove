import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int x, y, soma = 0;

        x = entrada.nextInt();
        y = entrada.nextInt();

        if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) soma += i;
            }
        } else {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) soma += i;
            }
        }

        System.out.printf("%d\n", soma);
    }
}
