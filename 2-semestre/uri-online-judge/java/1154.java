import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int idade, contador = 0;
        double total = 0;
        boolean flag = false;

        while (flag == false) {
            idade = entrada.nextInt();

            if (idade < 0) {
                flag = true;
            } else {
                total += idade;
                contador++;
            }
        }

        total /= contador;

        System.out.printf("%.2f\n", total);
    }
}
