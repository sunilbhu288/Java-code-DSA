public class Constructor1 {
  public static void main(String []args){
    Student s1 = new Student();
    Teacher t1 = new Teacher("ankit",44);
    System.out.println(t1.name);
    System.out.println(t1.age);

  }
}
class Student{
  String name;
  int age;
  Student(){
    System.out.println("this is non parameterised constructor");
  }
}
class Teacher{
  String name;
  int age;
   
  Teacher(String name,int age){
    this.name = name;
    this.age = age;
  }
  Teacher(){
    System.out.println("this is the parametrised constructers");
  }
}