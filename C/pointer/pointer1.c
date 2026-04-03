#include <stdio.h>

int main() {
        int a[4] = {0,2,4,8};
        int b[3]; // b = {2, 2, 4}
        int* p; // 2, 4, 8
        int sum = 0;
        
        /*
         * 4, 10, 22
         */

        for(int i=1; i<4; i++) { // 1,2,3
                p = a + i; // a[1] - 2, a[2] - 4, a[3] - 8
                b[i - 1] = *p - a[i - 1]; // b[0] = *p(a[1]) - a[0] = 2
                sum = sum + b[i - 1] + a[i]; // sum = sum + b[0] + a[1]
        }
        printf("%d", sum);
}