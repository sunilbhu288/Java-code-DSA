class Main{
  void smoke(){
    System.out.println("Class Parent");
  }
}
class Car2 extends Main{
  void drink(){
    System.out.println("Class Child");
  }
  public static void main(String args[]){
     
     Car2 c1 = new Car2();
     
     c1.drink();
     c1.smoke();
  }
}
