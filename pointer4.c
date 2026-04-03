#include <stdio.h>

main() {
    char* p = "KOREA";
    printf("%s\n", p); // KOREA
    printf("%s\n", p + 3); // EA
    printf("%s\n", *p); // K
    printf("%s\n", *(p + 3)); // E
    printf("%s\n", *p + 2); // R
}