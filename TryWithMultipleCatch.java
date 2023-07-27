public class TryWithMultipleCatch {
  public static void main(String []args){
    try{
      int a = 10/0;
      System.out.println("Check error");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Warning:ArrayIndexOutOfBoundsException ");
    }
    catch(ExceptionInInitializerError e){
      System.out.println("Only Exception");
    }
     catch(ArithmeticException e){
       System.out.println("Warning:ArithmeticException");
       System.out.println("Rahul");
     }
    
    System.out.println("End the program ");
  }
}
