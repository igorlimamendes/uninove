import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        double tempoGasto, veloMedia, litrosNec;
        
        Scanner entrada = new Scanner(System.in);
        
        tempoGasto = entrada.nextDouble();
        veloMedia = entrada.nextDouble();
        
        litrosNec = (tempoGasto * veloMedia) / 12;
        
        System.out.printf("%.3f\n", litrosNec);
    }
}
