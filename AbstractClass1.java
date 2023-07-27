abstract class AbstractClass1 {
  abstract void run();
}
  class Honda extends AbstractClass1{
  void run(){
    System.out.println("Ram");
  }
  public static void main(String []args){
    Honda  p1 = new  Honda ();
     p1.run();
  }
}
