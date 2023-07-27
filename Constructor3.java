import java.util.*;
public class Constructor3 {
  public static void main(String args []){
    Teacher t1 = new Teacher(12,"sunil");
    System.out.println(t1.data);
    System.out.println(t1.name);
    Student s1 = new Student(12,"white");
    System.out.println(s1.studentAge);
    System.out.println(s1.colour);
   }
  }
  class Teacher{
    int data;
    String name;

    Teacher(int data, String name){
      this.data = data;
      this.name = name;
    }

  }
  class Student{
    int studentAge;
    String colour;
    Student(int age, String colour){
      this.studentAge = age;
      this.colour = colour;
    }

  }

