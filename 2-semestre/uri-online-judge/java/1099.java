import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int i = 0;

        while (i < n) {
            int x = entrada.nextInt();
            int y = entrada.nextInt();
            int soma = 0;
            
            if (x < y) {
                for (int aux = x+1; aux < y; aux++) {
                    if (aux % 2 != 0) soma += aux;
                }
            } else {
                for (int aux = y+1; aux < x; aux++) {
                    if (aux % 2 != 0) soma += aux;
                }
            }

            System.out.printf("%d\n", soma);

            i++;
        }
    }
}
