import java.util.Scanner;
public class LoopProblems {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
    while(i<=n){
      int j =1;
      while(j<=n){
        System.out.print("*");
        j++;
      }
      System.out.println();//yeh new line k liye h
      i++;
    }
     
  }
}
