#include <stdio.h>
 
int main() {
    int n, i, f = 1;

    scanf("%d", &n);

    for (i = n; i >= 1; i--) {
        f *= i;
        n--;
    }

    printf("%d\n", f);
 
    return 0;
}