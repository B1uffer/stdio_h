#include <stdio.h>

main() {
   int res = mp(2,10);
   printf("%d", res);
}

int mp(int base, int exp) {
   int res = 1;
   for(int i=0; i<exp; i++) { // 0 ~ 9
      res *= base; // 2를 계속 곱함, 2^10
   }
   return res; // 512, 틀렸음 2의 10승
}