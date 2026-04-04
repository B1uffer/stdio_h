package Java;

public class q7 {
   public static void main(String[] args) {
      int j, i;
      for(j = 0, i = 0; i <= 5; i++) {
         j += i; // 0, 1, 2, 3, 4, 5
         System.out.println(i); // 0 + 1 + 2 + 3 + 4 5 = 15
         if(i == 5) {
            System.out.println("=");
            System.out.println(j);
         } else {
            System.out.println("+");
         }
      }
   }
}
