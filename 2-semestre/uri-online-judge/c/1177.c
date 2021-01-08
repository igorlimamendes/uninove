#include <stdio.h>
 
int main() {
    int t, i, c = 0, arr[1000];

    scanf("%d", &t);

    for (i = 0; i < 1000; i++) {
        arr[i] = c;
        c++;

        if (arr[i] == t-1) c = 0;

        printf("N[%d] = %d\n", i, arr[i]);
    }

    return 0;
}
