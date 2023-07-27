import java.util.Scanner;
public class Recursion3 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = 1;
    recursion(x,n);
  }
  public static void recursion(int x,int n){
    if(x==n){
      return;
    }
    System.out.print(x+" ");
    recursion(x+1,n);
    //System.out.println();
    System.out.print(x+" ");
  }
}
