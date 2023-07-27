import java.util.Scanner;
public class OnlyTest16 {
  public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int num = sc.nextInt();
     int arr[] = new int [size];
     for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
     }
  }
  public static void recursion(int arr[], int size, int num){
    if(size==0){
      return;
    }
    // if(size == arr.length ){
    //   return;
    // }
    recursion(arr,size-1,num);
    

  }
}
