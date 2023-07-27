public class Inheritance {
  public static void main(String []args){
    Student s1 = new Student();
    s1.eat();
    s1.play();
    s1.run();
    System.out.println(s1.age);
    System.out.println(s1.name);

  }
}
class Teacher{
  int age = 40;
  String name = " Ramesh";

  public void eat(){
    System.out.println("ram eat food");
  } 
  public void run(){
    System.out.println("ram run in ground");
  }
}
class Student extends Teacher{
     public void play(){
      System.out.println("play the game");
     }
}
