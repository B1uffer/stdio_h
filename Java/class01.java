package Java;

public class class01 {
   public static void main(String[] args) {
      cond obj = new cond(3);
      obj.a = 5;
      int b = obj.func(); // 56
      System.out.println(obj.a + b); // 5 + 56 = 61
   }
}

class cond {
   int a; // 5
   public cond(int a) {
      this.a = a;
   }

   public int func() {
      int b = 1;
      for(int i=1; i<a; i++) { // 1부터 4까지
         b += a * i; // 1 + 5 + 10 + 15 + 20 = 51
      }
      return a + b; // 56
   }
}
