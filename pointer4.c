#include <stdio.h>

main() {
    char* p = "KOREA";
    printf("%s\n", p); // KOREA
    printf("%s\n", p + 3); // EA
    printf("%s\n", *p); // K
    printf("%s\n", *(p + 3)); // E
    printf("%s\n", *p + 2); // R 틀렸음, *p는 p[0]을 바라보니까 K, 여기서 두칸 이동하니까 L, M 답은 M
}