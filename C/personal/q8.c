#include <stdio.h>

void align(int a[]) {
   int temp;
   for(int i=0; i<4; i++) { // 0~3
      for(int j=0; j<4-i; j++) { //0123, 012, 01, 0
         if(a[j]>a[j+1]) { // 앞이 뒤보다 크다면, 뒤랑 앞을 바꿈
            temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
         }
      }
   }
}

main() {
   int a[ ] = {85,75,50,100,95};
   align(a); // 정렬하는 메서드
   for(int i=0; i<5; i++) {
      printf("%d", a[i]); // 50, 75, 85, 95, 100
   }
}