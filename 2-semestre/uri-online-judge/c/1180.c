#include <stdio.h>
 
int main() {
    int n, m = 0, p = 0, i;

    scanf("%d", &n);

    int x[n];

    for (i = 0; i < n; i++) {
        scanf("%d", &x[i]);
    }

    m = x[0];

    for (i = 0; i < n; i++) {
        if (x[i] < m) {
            m = x[i];
            p = i;
        }
    }

    printf("Menor valor: %d\nPosicao: %d\n", m, p);

    return 0;
}
