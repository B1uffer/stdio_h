package Java.personal;

public class q7 {
   static int[] arr() {
      int a[] = new int[4]; // 배열 4개
      int b = a.length; // 4
      for(int i=0; i<b; i++) { // 0 ~ 3
         a[i] = i; // 0,1,2,3
      }
      return a;
   }  

   public static void main(String[] args) {
      int a[] = arr(); // 0,1,2,3
      for(int i=0; i<a.length; i++) { // 0 ~ 3
         System.out.println(a[i] + " "); // 0 1 2 3
      }
   }
}
