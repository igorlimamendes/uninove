#include <stdio.h>
 
int main() {
    int contagem = 0;
    double nota, media = 0;

    while (contagem != 2) {
        scanf("%lf", &nota);

        if (nota >= 0 && nota <= 10) {
            media += nota;
            contagem++;
        } else printf("nota invalida\n");

        if (contagem == 2) printf("media = %.2f\n", media/2);
    }
 
    return 0;
}
