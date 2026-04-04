package Java;

class A {
   int a;
   public A(int a) {
      this.a = a;
   }
   void display() {
      System.out.println("a=" + a); // 여기서 출력됨
   }
}

class B extends A {
   public B(int a) {
      super(a); // a = 10
      super.display(); // a=10
   }
}

public class class03 {
   public static void main(String[] args) {
      B obj = new B(10);
   }
}
