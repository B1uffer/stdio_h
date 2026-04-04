#include <stdio.h>

/*
 정수를 역순으로 출력하는 프로그램
 1234의 역순은 4321
 1230처럼 0으로 끝나는 정수는 고려하지 않는다
 이거 어려웠음, 복습 필요
 */

int main() {
    int number = 1234;
    int div = 10, result = 0;

    while(number > 0) {
        result = result * div; // 0, 40, 430, 4320
        result = result + number % div; // 4, 40 + 3 = 43, 430 + 2 = 432, 4320 + 1
        number = number / div; // 123, 12, 1
    }
    printf("%d", result);
}