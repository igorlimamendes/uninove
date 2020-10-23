#include <stdio.h>
 
int main() {
    int flag = 0;
    double nota, media = 0;

    do {
        scanf("%lf", &nota);
        
        int repetir = 0;

        if (nota >= 0 && nota <= 10) {
            media += nota;
            flag++;
        } else printf("nota invalida\n");

        if (flag == 2) {
            media = media / 2;
            printf("media = %.2f\n", media);

            while (repetir != 1 && repetir != 2) {
                printf("novo calculo (1-sim 2-nao)\n");
                scanf("%d", &repetir);

                if (repetir == 1) {
                    flag = 0;
                    media = 0;
                }
            }
        }

    } while (flag != 2);
 
    return 0;
}
