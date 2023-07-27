public class Constructor2 {
  String name;
  int age;

  Constructor2(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  Constructor2(){
    System.out.println("default constructor");
    

  }
  public static void main(String []args){
    Constructor2 t1 = new Constructor2("ankit", 20);
    System.out.println(t1.name);
    System.out.println(t1.age);
    Constructor2 t2 = new Constructor2();
    
  }
}
