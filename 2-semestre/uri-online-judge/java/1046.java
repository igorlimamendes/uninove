import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int horaIni, horaFim, total;
        
        Scanner entrada = new Scanner(System.in);
        
        horaIni = entrada.nextInt();
        horaFim = entrada.nextInt();
        
        total = 0;
        
        if (horaIni == horaFim) {
            total = 24;
        } else if (horaIni < horaFim) {
            total = horaFim - horaIni;
        } else {
            total = 24 - horaIni + horaFim;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)\n", total);
    }
}
