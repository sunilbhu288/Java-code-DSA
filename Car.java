class Vehicle {
   void showA() {                    
    System.out.println("a class");
  }
}
class Car extends Vehicle {
      void showB(){
      System.out.println("b class");
    }
  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.showA();
    myCar.showB();

  }
}

