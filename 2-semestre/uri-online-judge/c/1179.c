#include <stdio.h>
 
int main() {
    int valor, contPar = 0, contImp = 0, arrPar[5], arrImp[5], i, j;

    for (i = 0; i < 15; i++) {
        scanf("%d", &valor);

        if (valor % 2 == 0) {
            arrPar[contPar] = valor;
            contPar++;
        } else {
            arrImp[contImp] = valor;
            contImp++;
        }

        if (contPar == 5) {
            contPar = 0;

            for (j = 0; j < 5; j++) {
                printf("par[%d] = %d\n", j, arrPar[j]);
            }
        } else if (contImp == 5) {
            contImp = 0;
            
            for (j = 0; j < 5; j++) {
                printf("impar[%d] = %d\n", j, arrImp[j]);
            }
        }
    }

    for (i = 0; i < contImp; i++) {
        printf("impar[%d] = %d\n", i, arrImp[i]);
    }

    for (i = 0; i < contPar; i++) {
        printf("par[%d] = %d\n", i, arrPar[i]);
    }

    return 0;
}
