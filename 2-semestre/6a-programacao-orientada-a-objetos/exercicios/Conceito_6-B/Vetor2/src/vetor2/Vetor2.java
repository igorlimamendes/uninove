package vetor2;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int [] idades = new int [20];
        
        int i = 0;
        
        do {
            idades[i] = entrada.nextInt();
            
            i++;
        } while (i < 20);
        
        i = 0;
        
        do {
            System.out.printf("Idade %d: %d\n", i+1, idades[i]);
            
            i++;
        } while (i < 20);
    }
}
