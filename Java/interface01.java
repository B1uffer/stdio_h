package Java;

class Car implements Runnable {
   int a;
   public void run() {
      try {
         while(++a < 100) {
            System.out.println("miles traveled : " + a);
            Thread.sleep(100);
         }
      } catch(Exception e) {

      }
   }

}

public class interface01 {
   public static void main(String[] args) {
      Thread t1 = new Thread(new Car()); // 생성자 불러와야함
      t1.start();
   }
}
