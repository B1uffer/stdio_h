package Java;

public class q13 {
   public static void main(String[] args) {
      int result[] = new int[5];
      int arr[] = {77, 32, 10, 99, 50};
      for(int i=0; i<5; i++) {
         result[i] = 1; // {1,0,0,0,0}, {2,1,0,0,0}, {2,2,1,0,0}
         for(int j=0; j<5; j++) {
            if(arr[i] < arr[j]) { // 1, 3, 4, 0, 2
               result[i]++; // 2, 4, 5, 1, 3
            }
         } // for
      } // for
      for(int k=0; k<5; k++) {
         System.out.print(result[k]); // 2 4 5 1 3
      }
    }
}
