public class Constructor5 {
  public static void main(String args[]){
   Teacher t1 = new Teacher(30,"ankit","pngic");
   t1.display();
  }
}
class Teacher{
  int age;
  String name;
  String SchoolName;

  Teacher(int age, String name, String SchoolName){
    this.age = age;
    this.name = name;
    this.SchoolName = SchoolName;
  }
  public void display(){
     System.out.println(age+" "+ name+ " "+ SchoolName);
  }
}
