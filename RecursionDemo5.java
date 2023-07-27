import java.util.*;
public class RecursionDemo5 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   // solution(n,1);
    solution2(n);
  }
 /*  public static void solution(int n, int k){
    if(k==n){
      System.out.print(n);
      return;
    }
    System.out.print(k+" ");
    solution(n,k+1);
  }*/
  public static void solution2(int n){
    if(n==0){
      return;
    }
    solution2(n-1);
    System.out.print(n+" ");
  }
}
