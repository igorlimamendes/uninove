#include <stdio.h>
 
int main() {
    int t, i, pa, pb, anos;
    double g1, g2;

    scanf("%d", &t);

    for (i = 0; i < t; i++) {
        anos = 0;

        scanf("%d %d %lf %lf", &pa, &pb, &g1, &g2);

        while (pb >= pa) {
            pa += (pa * g1) / 100;
            pb += (pb * g2) / 100;
            anos++;

            if (anos > 100) break;
        }

        if (anos > 100) printf("Mais de 1 seculo.\n");
        else printf("%d anos.\n", anos);
    }

    return 0;
}
