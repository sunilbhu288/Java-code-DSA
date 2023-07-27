public class Constuctor8 {
  public static void main(String args[]){
   Teacher t1 = new Teacher(20,"ankit");
   t1.display();
  }
}
class Teacher{
  int age;
  String name;
  static String schoolName;
  Teacher(int age, String nmae){
    this.age = age;
    this.name = name;
  }
  void display(){
    System.out.println(age+" "+name+" "+schoolName);
  }
}
