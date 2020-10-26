#include <stdio.h>
 
int main() {
    int x, y, i, cont = 1;

    scanf("%d %d", &x, &y);

    for (i = 1; i <= y; i++) {
        if (x != cont) {
            printf("%d ", i);
            cont++;
        } else {
            printf("%d\n", i);
            cont = 1;
        }
    }

    return 0;
}
