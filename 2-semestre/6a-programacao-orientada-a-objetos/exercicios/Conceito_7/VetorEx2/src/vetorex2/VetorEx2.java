package vetorex2;
import java.util.Scanner;

public class VetorEx2 {
    public static void main(String[] args) {
        int [] idades = new int [10];
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            idades[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Vetor[%d] Idade: %d\n", i, idades[i]);
        }
    }
}
