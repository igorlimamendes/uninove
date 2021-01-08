#include <stdio.h>
 
int main() {
    int t, n, i, j;
    
    scanf("%d", &t);

    for (i = 0; i < t; i++) {
        scanf("%d", &n);

        long long int f1 = 0, f2 = 1, f3 = 0;

        if (n == 0) {
            printf("Fib(%d) = %lld\n", n, f1);
        } else if (n == 1) {
            printf("Fib(%d) = %lld\n", n, f2);
        } else if (n >= 2) {
            for (j = 2; j <= n; j++) {
                f3 = f1 + f2;
                if (j == n) printf("Fib(%d) = %lld\n", n, f3);
                f1 = f2;
                f2 = f3;
            }
        }
    }

    return 0;
}
