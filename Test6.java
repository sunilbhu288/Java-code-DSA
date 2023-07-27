import java.util.Scanner;
public class Test6 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    boolean value = false;
    for(int i=0;i<arr.length;i++){
      for(int j= i+1;j<arr.length;j++){
        if((arr[i]+arr[j]==num) || (arr[i]-arr[j]==num)){
          System.out.println("Yes");
          value = true;
          break;
        }
      }
    }
  
    if(!value==false){
      System.out.println("No");
    }
  }
}
