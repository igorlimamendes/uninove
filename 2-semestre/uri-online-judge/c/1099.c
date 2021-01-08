#include <stdio.h>
 
int main() {
    int n, i = 0, x, y, aux;

    scanf("%d", &n);

    while (i < n) {
        scanf("%d", &x);
        scanf("%d", &y);
        int soma = 0;
        
        if (x < y) {
            for (aux = x+1; aux < y; aux++) {
                if (aux % 2 != 0) soma += aux;
            }
        } else {
            for (aux = y+1; aux < x; aux++) {
                if (aux % 2 != 0) soma += aux;
            }
        }

        printf("%d\n", soma);

        i++;
    }

    return 0;
}
