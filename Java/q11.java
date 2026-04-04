package Java;

public class q11 {
   public static void main(String[] args) {
      int i = 0, c = 0;
      while(i < 10) {
         i++; // 1 2
         c *= i; // 0 * 1 = 0, 0 * 2 = 0
      }
      System.out.println(c); // 0
   } 
}
