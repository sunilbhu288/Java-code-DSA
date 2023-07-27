import java.util.Arrays;
import java.util.Scanner;
public class ArraysDemo3 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
      }
      t--;
    }

  }
}
