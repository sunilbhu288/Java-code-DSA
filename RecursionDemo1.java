import java.util.*;
public class RecursionDemo1 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n =1 ;
    solution(n,k);
  }
  public static void solution(int n,int k){
    if(n==10){
      System.out.print(n+" ");
      return;
    }
    System.out.print(n+" ");
    solution(n+1,k);
  }
}
