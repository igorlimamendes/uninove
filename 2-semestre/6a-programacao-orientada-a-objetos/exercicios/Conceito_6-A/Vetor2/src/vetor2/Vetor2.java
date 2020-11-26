package vetor2;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        int [] idades = new int [20];
        
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        
        while (i < 20) {
            idades[i] = entrada.nextInt();
            
            i++;
        }
        
        i = 0;
        
        while (i < 20) {
            System.out.println(idades[i]);
            
            i++;
        }
    }
}
