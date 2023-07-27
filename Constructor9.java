public class Constructor9 {
  int id;
  String name;
  int roll;

  Constructor9(int id, String name, int roll){
      this.id = id;
      this.name = name;
      this.roll = roll;
  }
  public void display(){
    System.out.println(id+" "+name +" "+roll);
  }
      public static void main(String args[]){
        Constructor9 c1 = new Constructor9(123,"ankit",20);
        c1.display();
      }
}
