import java.util.Scanner;
public class Recursion2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x =2;
    recursionencrease(x,n);
  }
  public static void recursionencrease(int x,int n){
    if(x==n){
      return ;
    }
   System.out.print(x+" ");
   recursionencrease(x+2,n);
  }
}
