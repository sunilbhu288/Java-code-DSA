public class Oops1 {
  public static void main(String []args){
    System.out.println("This is for c1");
    Dog c1 = new Dog();
   // System.out.println(c1.name);
   String v = c1.name;
   System.out.println(v);
    System.out.println(c1.color);
    c1.bark();
    c1.run();

    System.out.println();
    System.out.println("This is for c2");
    Dog c2 = new Dog();
    System.out.println(c2.name);
    System.out.println(c2.color);
    c2.bark();
    c2.run();

    System.out.println();
    System.out.println("This is for c3");
    Dog c3 = new Dog("seru","black");
    System.out.println(c3.name);
    System.out.println(c3.color);
    c3.bark();
     c3.run();
   }
  }
  class Dog{
    String name ;
    String color;
   // non paramitize cunstructor 
    public Dog(){
      this.name = "Chikku";
      this.color = "brown";
    }
    // paramitize cunstructor
    public Dog(String n, String c){
      this.name = n;
      this.color = c;
    }
    // public Dog(String p, String q){
    //   this.name = p;
    //   this.color = q;
    // }
    public void bark(){
      System.out.println("Dogs bark");
    }
    public void run(){
      System.out.println("Dogs run");
    }
  }

