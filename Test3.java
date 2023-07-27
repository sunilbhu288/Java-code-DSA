import java.util.Scanner;
public class Test3 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    boolean isReapeteValue = false;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i] == arr[j]){
          System.out.print(arr[i]+" ");
          isReapeteValue = true;
        }
      }
    }
    if(!isReapeteValue){
      System.out.println("Non repeate Number");
    }
  }
}
