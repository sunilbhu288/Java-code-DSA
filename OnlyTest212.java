import java.util.Scanner;
public class OnlyTest212 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    boolean value = false;
    for(int i=0;i<n;i++){
      if(arr[i]==k){
        System.out.print(i);
        value=true;
        break;
      }

    }
    if(!value){
      System.out.println("Index not find");
    }
  }
}
