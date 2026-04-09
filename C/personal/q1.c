#include <stdio.h>

/**
 * ???????
 * 이게 머임 모르겟음
 */

main() {
   int field[4][4] = {{0,1,0,1}, {0,0,0,1}, {1,1,1,0}, {0,1,1,1}};
   int mines[4][4] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
   int w = 4, h = 4;
   for(int y = 0; y < h; y++) { // 0,1,2,3
      for(int x = 0; x < w; x++) { // 0,1,2,3
         if(field[y][x] == 0) {
            continue;
         }
         for(int j = y - 1; j <= y + 1; j++) { // 0,1,2 부터 2,3,4까지
            for(int i = x - 1; i <= x + 1; i++) { // 0,1,2부터 2,3,4까지
               if(chkover(w,h,j,i) == 1) { // if문 통과하면
                  mines[j][i] += 1; // mines에 +1
               }
            }
         }
      }
   }
}

int chkover(int w, int h, int j, int i) {
   if(i >= 0 && i < w && j >= 0 && j < h) {
      return 1;
   }
   return 0;
}