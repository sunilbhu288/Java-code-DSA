import java.util.Scanner;
public class Recursion6 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int p = calFcatorial(n);
    System.out.println(p);

  }
  public static int calFcatorial(int n){
    if(n==1){
      return 1;
    }
   // int x = calFcatorial(n-1);
    //int fact = n*x;
    return  n*calFcatorial(n-1);
  }
}
