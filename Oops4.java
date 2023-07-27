public class Oops4 {
  public static void main(String [] args){
  Test2 t = new Test2();
 t.nameAndRollNo("rahul",100);
 t.play("cricket");
 System.out.println("now start for Test2");
 t.nameAndRollNo("mohit",200);
 t.play("Chess");
  }
}
class Test1{
  void nameAndRollNo(String name, int rollNo){
    System.out.println(name);
    System.out.println(rollNo);
  }
  void play(String game){
    System.out.println(game);
  }
}
class Test2 extends Test1 {
  void nameAndRollNo(String name, int rollNo){
    System.out.println(name);
    System.out.println(rollNo);
  }
  void play(String game){
    System.out.println(game);
  }
}
