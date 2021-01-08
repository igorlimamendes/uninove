import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int flag = 0;
        double nota, media = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            nota = entrada.nextDouble();
            int repetir = 0;

            if (nota >= 0 && nota <= 10) {
                media += nota;
                flag++;   
            } else System.out.printf("nota invalida\n");

            if (flag == 2) {
                media = media / 2;
                System.out.printf("media = %.2f\n", media);

                while (repetir != 1 && repetir != 2) {
                    System.out.printf("novo calculo (1-sim 2-nao)\n");
                    repetir = entrada.nextInt();
                    
                    if (repetir == 1) {
                        flag = 0;
                        media = 0;
                    }
                }
            }
        } while (flag != 2);
    }
}
