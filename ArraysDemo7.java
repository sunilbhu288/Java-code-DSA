import java.util.Scanner;
public class ArraysDemo7 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[]= new int[size];
    for(int i=0;i<size;i++){
      arr[i] = sc.nextInt();
    }
    int sum =0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        i++;
      }
      sum = sum+arr[i];
    }
    System.out.println(sum);
    if(sum<0){
      System.out.println(0);
    }
  }
}
