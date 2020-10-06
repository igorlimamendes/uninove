#include <stdio.h>

int main() {
    int horaIni, minuIni, horaFim, minuFim, horaMinuIniDif, horaMinuFimDif, diferenca, horas, minutos;

    scanf("%d", &horaIni);
    scanf("%d", &minuIni);
    scanf("%d", &horaFim);
    scanf("%d", &minuFim);
    
    horaMinuIniDif = horaIni * 60 + minuIni;
    horaMinuFimDif = horaFim * 60 + minuFim;

    diferenca = (24 * 60 - horaMinuIniDif) + horaMinuFimDif;

    horas = diferenca / 60;
    minutos = diferenca % 60;

    if (horas >= 24 && minutos >= 1) horas = horas % 24;

    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    
    return 0;
}
