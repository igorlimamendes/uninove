import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        int x, y;

        Scanner entrada = new Scanner(System.in);

        do {
            x = entrada.nextInt();
            y = entrada.nextInt();

            if (x == 0 || y == 0) break;
            else if (x > 0 && y > 0) System.out.printf("primeiro\n");
            else if (x < 0 && y > 0) System.out.printf("segundo\n");
            else if (x < 0 && y < 0) System.out.printf("terceiro\n");
            else System.out.printf("quarto\n");
        } while (x != 0 && y != 0);
    }
}
