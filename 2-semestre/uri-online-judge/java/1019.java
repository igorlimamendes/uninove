import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int segEvento, horas, minutos, segundos;
        
        Scanner entrada = new Scanner(System.in);
        
        segEvento = entrada.nextInt();
        
        horas = ((segEvento / 60) / 60) % 60;
        minutos = (segEvento / 60) % 60;
        segundos = segEvento % 60;
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
