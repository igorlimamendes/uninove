#include <stdio.h>

int main() {
    int horaIni, horaFim, total;
    
    scanf("%d", &horaIni);
    scanf("%d", &horaFim);
    
    total = 0;
    
    if (horaIni == horaFim) {
        total = 24;
    } else if (horaIni < horaFim) {
        total = horaFim - horaIni;
    } else {
        total = 24 - horaIni + horaFim;
    }
    
    printf("O JOGO DUROU %d HORA(S)\n", total);
    
    return 0;
}
