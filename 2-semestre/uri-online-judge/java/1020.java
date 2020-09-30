import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int idadeDias, anos, meses, dias;
        
        Scanner entrada = new Scanner(System.in);
        
        idadeDias = entrada.nextInt();
        
        anos = idadeDias / 365;
        meses = (idadeDias % 365) / 30;
        dias = (idadeDias % 365) % 30;
        
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
    }
}
