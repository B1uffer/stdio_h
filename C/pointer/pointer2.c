#include <stdio.h>

int main() {
    int* array[3]; // {12, 24, 36}
    int a = 12, b = 24, c = 36;
    array[0] = &a; // 12
    array[1] = &b; // 24
    array[2] = &c; // 36
    printf("%d", *array[1] + **array + 1); // 24 + 12 + 1 = 37
}