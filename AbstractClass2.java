abstract class AbstractClass2 {
  abstract void age();
  abstract void height();
  
}
class Student extends AbstractClass2{
  void age(){
    System.out.println("age are same");
  }
  void height(){
    System.out.println("age both are same");
  }


    public static void main(String []args){
      AbstractClass2 t1 = new Student();
      t1.age();
      t1.height();
    }
  
}
