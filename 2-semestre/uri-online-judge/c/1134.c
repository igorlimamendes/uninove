#include <stdio.h>
 
int main() {
    int fim = 0, painel, alc = 0, gas = 0, die = 0;

    do {
        scanf("%d", &painel);

        if (painel == 1) alc++;
        else if (painel == 2) gas++;
        else if (painel == 3) die++;
        else if (painel == 4) fim = 4;
    } while (fim != 4);

    printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alc, gas, die);

    return 0;
}
