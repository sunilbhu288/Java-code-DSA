public class Test44 {
  public static void main(String args[]) {
    try{
      //  int a[]=new int[5];
      //  a[3]=10/0;
      int a = 10/0;
     System.out.println("First print statement in try block");

    } 
    catch(ArithmeticException e) {
      
       System.out.println("Warning: ArithmeticException");
    } 
    catch(ArrayIndexOutOfBoundsException e) {

       System.out.println("Warning: ArrayIndexOutOfBoundsException");
    }
     catch(Exception e) {
       System.out.println("Warning: Some Other exception");
    }
    System.out.println("Out of try-catch block");
 }
}
