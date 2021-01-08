import java.io.IOException;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int reset = 1, golIn, golGr, totJo = 0, totEm = 0, totIn = 0, totGr = 0;

        do {
            golIn = entrada.nextInt();
            golGr = entrada.nextInt();

            totJo++;
            if (golIn == golGr) totEm++;
            else if (golIn < golGr) totGr++;
            else totIn++;

            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            reset = entrada.nextInt();

            if (reset == 2) {
                System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n", totJo, totIn, totGr, totEm);

                if (totIn == totGr) System.out.printf("Nao houve vencedor\n");
                else if (totIn < totGr) System.out.printf("Gremio venceu mais");
                else System.out.printf("Inter venceu mais\n");
            }
        } while (reset == 1);
    }
}
