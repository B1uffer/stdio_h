#include <stdio.h>

int main() {
    int s, el = 0;
    for(int i = 6; i <= 30; i++) { // 6 ~ 30
        s = 0;
        /*
         * i가 6일때 j = 1부터 3까지
         */
        for(int j = 1; j <= i / 2; j++) { // 1 ~ 15
            if(i % j == 0) { // 6, 12
                s = s + j; // 6 + 12 = 18
            }
        } // for
        if(s == i) {
            el++; // 2번 ++ 됨
        }
    } // for
    printf("%d", el); // 2
}