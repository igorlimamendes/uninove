#include <stdio.h>
 
int main() {
    int x, i;

    scanf("%d", &x);

    while (x != 0) {
        for (i = 1; i <= x; i++) {
            if (i != x) printf("%d ", i);
            else printf("%d\n", i);
        }

        scanf("%d", &x);
    }

    return 0;
}
