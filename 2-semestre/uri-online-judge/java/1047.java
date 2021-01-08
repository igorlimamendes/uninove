import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int horaIni, minuIni, horaMinuIniDif, horaFim, minuFim, horaMinuFimDif, diferenca, horas, minutos;

        Scanner entrada = new Scanner(System.in);

        horaIni = entrada.nextInt();
        minuIni = entrada.nextInt();
        horaFim = entrada.nextInt();
        minuFim = entrada.nextInt();
        
        horaMinuIniDif = horaIni * 60 + minuIni;
        horaMinuFimDif = horaFim * 60 + minuFim;

        diferenca = (24 * 60 - horaMinuIniDif) + horaMinuFimDif;

        horas = diferenca / 60;
        minutos = diferenca % 60;

        if (horas >= 24 && minutos >= 1) horas = horas % 24;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    }
}
