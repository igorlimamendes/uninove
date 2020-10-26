import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();

        while (x != 0) {
            for (int i = 1; i <= x; i++) {
                if (i == x) System.out.printf(i + "\n");
                else System.out.printf(i + " ");
            }

            x = entrada.nextInt();
        }
    }
}
