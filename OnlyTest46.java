import java.util.Scanner;
public class OnlyTest46 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int n = 2;
    int m = sc.nextInt();
    int ans =  powerTon(x,n);
    System.out.println(m%ans);
  }
  public static int powerTon(int x, int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int k =  powerTon(x,n-1);
    int result = x*k;
    return result;
  }
  
}
