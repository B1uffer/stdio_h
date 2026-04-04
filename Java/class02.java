package Java;

class A {
   int a;
   int b;
}

public class class02 {
   static void func1(A m) {
      m.a *= 10; // a에 10을 곱함
   }

   static void func2(A m) {
      m.a += m.b; // a에 b를 더함
   }

   public static void main(String[] args) {
      A m = new A();
      m.a = 100; // a = 100
      func1(m); // a = 1000
      m.b = m.a; // b = 1000
      func2(m); // a = 2000
      System.out.printf("%d", m.a); // 2000
   }
}
