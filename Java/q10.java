package Java;

public class q10 {
   public static void main(String[] args) {
      int ary[][] = new int[3][5];
      int n = 1;
      for(int i=0; i<3; i++) { // ary[].length 까지
         for(int j=0; j<5; j++) { // ary[][].length 까지
            ary[i][j] = j * 3 + i + 1;
            System.out.println(ary[i][j] + " ");
         }
         System.out.println();
      }
   }
}
