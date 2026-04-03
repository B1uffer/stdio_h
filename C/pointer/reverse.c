#include <stdio.h>

void reverse(char* str) {
        char* left = str;
        char* right = str;

        while(*right) {
                right++;
        }
        right--;

        while(left < right) {
                char temp = *left;
                *left = *right;
                *right = temp;

                left++;
                right--;
        }
}

int main() {
        char s[] = "hello";
        reverse(s);
        printf("%s\n", s);
}