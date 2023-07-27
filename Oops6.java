public class Oops6 {
  public static void main(String []args){
    Student s1 = new Student();
     s1.name = "aman";
     s1.age = 24;
     s1.gender = 'M';
     s1.printInfo();

  }
}
class Student{
  String name;
  int age;
  char gender;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.gender);

  }
}
