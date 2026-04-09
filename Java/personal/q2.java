package Java.personal;

public class q2 {
   static int[] mkarr() {
      int[] tmpArr = new int[4]; // 길이 4
      for(int i = 0; i < tmpArr.length; i++) {
         tmpArr[i] = i; // {0,1,2,3}
      }
      return tmpArr;
   }

   public static void main(String[] args) {
      int[] arr;
      arr = mkarr(); // {0,1,2,3}
      for(int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
   }
}