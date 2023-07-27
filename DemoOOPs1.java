public class DemoOOPs1 {
  public static void main(String []args){
    Demo n1 = new Demo();
   int k = n1.x;
   System.out.println(k);
   n1.run();

  }
}
class Demo{
  int x = 10;
  public void run(){
    System.out.println("ram run");
  }
}
