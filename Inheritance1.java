import java.util.*;
 class Inheritance1 {
  void show(){
    System.out.println("Parents");
  }
}
class Student extends Inheritance1{
  void store(){
    System.out.println("child");
  }
  
}
 class Teacher{
  public static void main(String args[]){
    Student s1 = new Student ();
    s1.show();
    s1.store();
  }
}