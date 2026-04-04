package Java;

public class q12 {
   public static void main(String[] args) {
      int a = 0, sum = 0;
      while(a < 10) { // 9 까지
         a++; // 1 ~ 10
         // 짝수만 sum에 더하는 로직
         if(a%2 == 1) { // a % 2 했을때 나머지가 1이면 처음으로 돌아감
            continue;
         } // a%2 != 1이면 sum += a를 한다
         sum += a; // 2 + 4 + 6 + 8 + 10
      }
      System.out.println(sum); // 55, 틀렸음 답은 30
   }
}
