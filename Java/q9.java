package Java;

public class q9 {
   public static void main(String[] args) {
      int a[] = new int[8]; // 0, 1, 0, 1, 0, 0, 0, 0
      int i = 0;
      int n = 10;
      while(n > 0) {
         a[i++] = n % 2; // 0, 1, 0, 1
         n /= 2; // 5, 2, 1, 0
      }
      for(i = 7; i >= 0; i--) {
         System.out.println(a[i]); // 0, 0, 0, 0, 1, 0, 1, 0
      }
      System.out.println("1/2 : " + 1/2);
   }
}
