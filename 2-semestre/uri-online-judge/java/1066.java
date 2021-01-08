import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] valores = new int[5];
        int valorPar = 0;
        int valorImp = 0;
        int valorPos = 0;
        int valorNeg = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = entrada.nextInt();
            
            if (valores[i] % 2 == 0) valorPar++;
            if (valores[i] % 2 != 0) valorImp++;
            if (valores[i] > 0) valorPos++;
            if (valores[i] < 0) valorNeg++;
        }
        
        System.out.printf("%d valor(es) par(es)\n", valorPar);
        System.out.printf("%d valor(es) impar(es)\n", valorImp);
        System.out.printf("%d valor(es) positivo(s)\n", valorPos);
        System.out.printf("%d valor(es) negativo(s)\n", valorNeg);
    }
}
