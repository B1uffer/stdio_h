package Java;

class Parent {
   int compute(int num) {
      if(num <= 1) {
         return num;
      }
      return compute(num - 1) + compute(num - 2);
   }
}

class Child extends Parent {
   int compute(int num) {
      if(num <= 1) {
         return num;
      }
      return compute(num - 1) + compute(num - 3);
   }
}

public class change02 {
   public static void main(String[] args) {
      Parent obj = new Child();
      System.out.print(obj.compute(4)); 
      // compute(3) + compute(1) = compute(2) + compute(0) + 1 = compute(1) + compute(-1) + 0 + 1 = 1 - 1 + 0 + 1 = 1
   }
}
