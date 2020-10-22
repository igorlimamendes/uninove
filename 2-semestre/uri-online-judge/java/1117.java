import java.io.IOException;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int contagem = 0;
        double nota, media = 0;

        while (contagem != 2) {
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                media += nota;
                contagem++;
            } else System.out.printf("nota invalida\n");

            if (contagem == 2) System.out.printf("media = %.2f\n", media/2);
        }
    }
}
