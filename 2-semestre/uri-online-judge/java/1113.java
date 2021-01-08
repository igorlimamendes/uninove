import java.io.IOException;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
        int x, y;

        Scanner entrada = new Scanner(System.in);

        do {
            x = entrada.nextInt();
            y = entrada.nextInt();

            if (x == y) break;
            else if (x < y) System.out.printf("Crescente\n");
            else System.out.printf("Decrescente\n");
        } while (x != y);
    }
}
