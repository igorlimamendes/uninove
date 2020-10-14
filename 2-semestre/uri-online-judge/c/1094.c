#include <stdio.h>
#include <string.h>

int main() {
    int n, i;
    char strAni[] = "X";
    
    scanf("%d", &n);
    
    
    int numCob = 0;
    int totCob = 0;
    char C[] = "C";
    char R[] = "R";
    char S[] = "S";
    int totCoe = 0;
    int totRat = 0;
    int totSap = 0;

    for (i = 0; i < n; i++) {
        scanf("%d", &numCob);
        totCob += numCob;

        scanf("%s", strAni);
        if (0 == strcmp(strAni, C)) totCoe += numCob;
        if (0 == strcmp(strAni, R)) totRat += numCob;
        if (0 == strcmp(strAni, S)) totSap += numCob;
    }

    double perCoe = (totCoe * 100) / (double)totCob;
    double perRat = (totRat * 100) / (double)totCob;
    double perSap = (totSap * 100) / (double)totCob;

    printf("Total: %d cobaias\n", totCob);
    printf("Total de coelhos: %d\n", totCoe);
    printf("Total de ratos: %d\n", totRat);
    printf("Total de sapos: %d\n", totSap);
    printf("Percentual de coelhos: %.2f %%\n", perCoe);
    printf("Percentual de ratos: %.2f %%\n", perRat);
    printf("Percentual de sapos: %.2f %%\n", perSap);
    
    return 0;
}
