public class Oops2 {
  public static void main(String []args){
    Test t1 = new Test();
    t1.show(10);
    t1.print();

  }
  
}
class Test{
  int i;
  void show(int x){
    i = x;
  }
  void print(){
    System.out.println(i);
  }
}
