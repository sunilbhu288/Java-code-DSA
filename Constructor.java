import java.util.Scanner;
public class Constructor {
  public static void main(String []args){
    Dog d1 = new Dog();
      System.out.println(d1.name);
      System.out.println(d1.colour);
      d1.run();
      d1.run();
      System.out.println("this is for 2'nd constructor");
      d1.name = "rajesh";
      System.out.println(d1.name);
      d1.colour = "black";
      System.out.println(d1.colour);

  }
}
class Dog{
  String name ;
  String colour;
  Dog(){
   this.name = "rajan";
   this.colour = "red";
  }
  public void run(){
    System.out.println("Ram can run");
  }
  public void eat(){
    System.out.println("Ram can eat");
  }
  Dog(String name,String colour){
    this.name = name;
    this.colour= colour;
  }
  
}
