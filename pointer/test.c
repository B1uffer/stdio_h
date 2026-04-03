#include <stdio.h>

int my_strlen(char* str);

int main() {
    char* s = "hello";

    int len = my_strlen(s);
    printf("%d\n", len);
}

int my_strlen(char* str) {
    int size = 0;
    while(*str != '\0') {
        str++;
        size ++;
    }
    return size;
}