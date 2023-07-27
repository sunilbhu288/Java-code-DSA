import java.util.Scanner;
public class Test19 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  //   returnValue(n);
  // }
  // public static void returnValue(int n){
  //   if(n==0){
  //     return;
  //   }
  //   System.out.print(n +" ");
  //   returnValue(n-1);
  // for(int i=1;i<=n;i++){
  //   System.out.print(i+" ");
  // }
  while(n<=0){
    System.out.print(n+" ");
    n++;
  }

  }
}
