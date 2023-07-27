import java.util.Scanner;
public class Test17 {
  // public static void bubbolSort(int []arr){
  //   for(int i=0;i<arr.length;i++){
  //     System.out.print(arr[i]+" ");
  //   }SelectionSort
  // }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]= arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    //bubbolSort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
