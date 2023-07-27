import java.util.Scanner;
public class OnlyTest14 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int cat = sc.nextInt();
    int ans = recursion(cat);
    System.out.println(ans);
  }
  public static int recursion( int cat){
    if(cat==0){
      return 0;
    }
    int p = 2+recursion(cat-1);
    return p;
  }
}
