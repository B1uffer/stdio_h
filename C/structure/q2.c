#include <stdio.h>

main() {
   struct insa { // 선언
      char name[10];
      int age;
   } a[] = {"Kim", 28, "Lee", 38, "Park", 42, "Choi", 31}; // 객체 생성
   struct insa* p; // 포인터 객체
   p = a; // a를 바라봄
   p++; // 포인터 한칸 이동
   printf("%s\n", p->name); // Lee
   printf("%d\n", p->age); // 38
}