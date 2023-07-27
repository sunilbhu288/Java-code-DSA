public class SwapObject1 {
  public static void main(String []args){
    
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "A";
   // p1.methode();
    
    Person p2 = new Person();
    p2.age = 20;
    p2.name = "B";
   // p2.methode();
   swap(p1,p2);
    p2.methode();



  }
}
  class Person{
    int age ;
    String name;
    public void methode(){
      System.out.println(age+" "+name);
    }
    public static void swap(Person p1, Person p2){
      Person temp = p1;
      p1 = p2;
      p2 = temp;
    }
  }

