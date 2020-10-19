#include <stdio.h>

int main(void) {
    int m, n, i;
    
    do {
        scanf("%d %d", &m, &n);

        if (m <= 0 || n <= 0) break;

        int soma = 0;

        if (m > 0 && n > 0) {
            if (m < n) {
                for (i = m; i <= n; i++) {
                    printf("%d ", i);
                    soma += i;
                }
            } else {
                for (i = n; i <= m; i++) {
                    printf("%d ", i);
                    soma += i;
                }
            }

            printf("Sum=%d\n", soma);
        }
    } while (m > 0 && n > 0);

    return 0;
}
