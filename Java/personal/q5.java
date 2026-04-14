package Java.personal;

public class q5 {
   public static void main(String[] args) {
      System.out.print(q5.check(1));
   }

   static String check(int num) { // static
      return (num >= 0) ? "positive" : "nagitive";
   }
}
