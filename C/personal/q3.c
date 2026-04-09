#include <stdio.h>
 int isPrime(int number) {
   for(int i = 2; i < number; i++) { // 2 ~ 13194
      if(number % i == 0) { // 13195를 i로 나눈 나머지가 0이면 return 0
         return 0;
      }
   }
   return 1; // 그 외엔 return 1
 }

 int main() {
   int number = 13195;
   int max_div = 0;
   for(int i = 2; i < number; i++) { // 2 ~ 13194
      if(isPrime(i) == 1 && number % i == 0) {
         max_div = i;
      }
   }
   printf("%d", max_div); // 13194, 틀렸음
 }