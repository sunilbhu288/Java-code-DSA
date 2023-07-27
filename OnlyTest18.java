import java.util.Scanner;
public class OnlyTest18 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    boolean findIndex = false;
    for(int i=0;i<n;i++){
      if(arr[i]==num){
        System.out.print(i+" ");
        findIndex=true;
      }
    }
    if(!findIndex){
      System.out.print("num is not found");
    }
  }
}
