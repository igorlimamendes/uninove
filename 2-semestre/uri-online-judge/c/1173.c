#include <stdio.h>
 
int main() {    
    int arr[10], n, i, j;

    scanf("%d", &n);

    arr[0] = n;

    for (i = 1; i < 10; i++) {
        arr[i] = arr[i-1] * 2;
    }

    for (j = 0; j < 10; j++) {
        printf("N[%d] = %d\n", j, arr[j]);
    }

    return 0;
}
