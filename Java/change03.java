package Java;

abstract class Vehicle {
   String name;
   abstract public String getName(String val);
   public String getName() {
      return "Vehicle name : " + name;
   }
}

class Car extends Vehicle {
   private String name;
   public Car(String val) {
      name = super.name = val;
   }
   public String getName(String val) {
      return "Car name : " + val;
   }

   public String getName(byte[] val) {
      return "Car name : " + val;
   } 
}

public class change03 {
   public static void main(String[] args) {
      Vehicle obj = new Car("Speak"); //Vehicle의 name이 Speak가 됨
      System.out.println(obj.getName()); // Vehicle name : Speak
   }
}
