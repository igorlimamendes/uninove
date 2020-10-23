#include <stdio.h>
 
int main() {
    int reset = 1, golIn, golGr, totJo = 0, totEm = 0, totIn = 0, totGr = 0;
    
    do {
        scanf("%d", &golIn);
        scanf("%d", &golGr);

        totJo++;
        if (golIn == golGr) totEm++;
        else if (golIn < golGr) totGr++;
        else totIn++;

        printf("Novo grenal (1-sim 2-nao)\n");
        scanf("%d", &reset);

        if (reset == 2) {
            printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n", totJo, totIn, totGr, totEm);

            if (totIn == totGr) printf("Nao houve vencedor\n");
            else if (totIn < totGr) printf("Gremio venceu mais");
            else printf("Inter venceu mais\n");
        }
    } while (reset == 1);
 
    return 0;
}
