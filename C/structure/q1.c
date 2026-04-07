#include <stdio.h>
struct A {
   int n;
   int g;
};

int main() {
   struct A st[2]; // {{n,g}, {n,g}}
   for(int i=0; i<2; i++) {
      st[i].n = i; // 0 , 1
      st[i].g = i+1; // 1, 2
   }
   printf("%d", st[0].n + st[1].g); // 0 + 2 = 2
}