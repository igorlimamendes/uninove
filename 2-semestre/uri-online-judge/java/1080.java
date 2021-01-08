import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] valores = new int[100];
        int maior = 0;
        int posicao = 0;
        int aux = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {
            valores[i] = entrada.nextInt();

            if (valores[i] > aux) {
                maior = valores[i];
                posicao = i+1;
                aux = valores[i];
            }
        }
        
        System.out.printf("%d\n", maior);
        System.out.printf("%d\n", posicao);
    }
}
