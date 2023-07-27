public class Oops3 {
  public static void main(String []args){
    Test1 t1 = new Test1();
  //  System.out.println(t1.y);
    t1.play();
    System.out.println("start for test2 ");
    Test2 t2 = new Test2();
    t2.show();
    t2.nameAndRollNo("mohit",100);



  }
}
  class Test1{
    //int y = 10;
    String name = "Rahul";
    void play(){
      System.out.println("Ram is playing");
    }
  }

class Test2{
    void show(){
      System.out.println("class test2");
    }
    void nameAndRollNo(String name, int x){
      System.out.println("this is from test2 "+name);
      System.out.println("this is from test2 "+ x);
    }
}
