import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int fim = 0, painel, alc = 0, gas = 0, die = 0;

        do {
            painel = entrada.nextInt();

            if (painel == 1) alc++;
            else if (painel == 2) gas++;
            else if (painel == 3) die++;
            else if (painel == 4) fim = 4;
        } while (fim != 4);

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alc, gas, die);
    }
}
