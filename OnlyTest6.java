import java.util.Scanner;
public class OnlyTest6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    recursion(start,end);
  }
  public static void recursion(int start,int end){
    if(start == end){
      return;
    }
    System.out.print(start+" ");
    recursion(start+1,end);
  }
}
