import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int f = 1;

        for (int i = n; i >= 1; i--) {
            f *= i;
            n--;
        }

        System.out.printf("%d\n", f);
    }
}
