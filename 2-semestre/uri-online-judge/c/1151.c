#include <stdio.h>
 
int main() {
    int n, f1 = 0, f2 = 1, f3 = 0, i;

    scanf("%d", &n);

    if (n == 1) {
        printf("%d\n", f1);
    } else if (n == 2) {
        printf("%d %d\n", f1, f2);
    } else if (n >= 3) {
        printf("%d %d ", f1, f2);
        
        for (i = 2; i < n; i++) {
            f3 = f1 + f2;
            if (i+1 != n) printf("%d ", f3);
            else printf("%d\n", f3);
            f1 = f2;
            f2 = f3;
        }
    }

    return 0;
}
