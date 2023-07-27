public class PolyMorphism {
  public static void main(String args []){
   Student s1 = new Student();
   s1.printInfo("sunil");
   s1.printInfo(24);
   s1.printInfo("aman",44);
   Teacher t1 = new Teacher();
   t1.printInfo("teacher");
   t1.printInfo(3000);
  }
}
class Student{
  public void printInfo(String name){
    System.out.println(name);
  }
  public void printInfo(int age){
    System.out.println(age);
  }
  public void printInfo(String name , int age){
    System.out.println(name +" " + age);
  }
}
class Teacher{
  public void  printInfo(String type){
    System.out.println(type);
  }
  public void printInfo(int income){
    System.out.println(income);
  }

}
