import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int cont = 1;

        for (int i = 1; i <= y; i++) {
            if (cont != x) {
                System.out.printf("%d ", i);
                cont++;
            } else {
                System.out.printf("%d\n", i);
                cont = 1;
            }
        }
    }
}
