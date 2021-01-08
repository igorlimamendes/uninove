import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int valor, contPar = 0, contImp = 0;
        int arrPar[] = new int[5], arrImp[] = new int[5];

        for (int i = 0; i < 15; i++) {
            valor = entrada.nextInt();

            if (valor % 2 == 0) {
                arrPar[contPar] = valor;
                contPar++;
            } else {
                arrImp[contImp] = valor;
                contImp++;
            }

            if (contPar == 5) {
                contPar = 0;

                for (int j = 0; j < 5; j++) {
                    System.out.printf("par[%d] = %d\n", j, arrPar[j]);
                }
            } else if (contImp == 5) {
                contImp = 0;
                
                for (int j = 0; j < 5; j++) {
                    System.out.printf("impar[%d] = %d\n", j, arrImp[j]);
                }
            }
        }

        for (int i = 0; i < contImp; i++) {
            System.out.printf("impar[%d] = %d\n", i, arrImp[i]);
        }

        for (int i = 0; i < contPar; i++) {
            System.out.printf("par[%d] = %d\n", i, arrPar[i]);
        }
    }
}
