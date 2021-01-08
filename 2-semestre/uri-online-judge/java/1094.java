import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        int[] numCob = new int[n];
        String[] strAni = new String[n];
        
        for (int i = 0; i < n; i++) {
            numCob[i] = entrada.nextInt();
            strAni[i] = entrada.next();
        }
        
        int totCob = 0;
        int totCoe = 0;
        int totRat = 0;
        int totSap = 0;
        
        for (int i = 0; i < numCob.length; i++) {
            totCob += numCob[i];
        }
        
        for (int i = 0; i < n; i++) {
            if (strAni[i].equals("C")) {
                totCoe += numCob[i];
            } else if (strAni[i].equals("R")) {
                totRat += numCob[i];
            } else if (strAni[i].equals("S")) {
                totSap += numCob[i];
            }
        }

        double percCoe = (totCoe * 100) / (double)totCob;
        double percRat = (totRat * 100) / (double)totCob;
        double percSap = (totSap * 100) / (double)totCob;

        System.out.printf("Total: %d cobaias\n", totCob);
        System.out.printf("Total de coelhos: %d\n", totCoe);
        System.out.printf("Total de ratos: %d\n", totRat);
        System.out.printf("Total de sapos: %d\n", totSap);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percCoe);
        System.out.printf("Percentual de ratos: %.2f %%\n", percRat);
        System.out.printf("Percentual de sapos: %.2f %%\n", percSap);
    }
}
