public class Constructor6 {
  public static void main(String args[]){
    Teacher t1 = new Teacher(30, "ankit",1234);
    Teacher t2 = new Teacher(40,"shekhar",456);
    Student s1 = new Student(20,"bashin");
    t1.display();
    t2.display();
    s1.display2();
  }
}
class Teacher{
  int age;
  String name;
  int rollNo;

  Teacher(int age, String name, int rollNo){
     this.age = age;
     this.name =  name;
     this.rollNo = rollNo;
     System.out.println("amit");
  }
  public void display(){
    System.out.print(age+" "+name+" "+rollNo);
    System.out.println();
  }
}
class Student{
   int studentAge;
   String studentName;
   
   Student(int studentAge, String studentNmae){
      this.studentAge = studentAge;
      this.studentName = studentName;
   }
   void display2(){
      System.out.println(studentAge +" "+studentName);
      System.out.println();
   }
}