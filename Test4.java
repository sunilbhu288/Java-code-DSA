import java.util.Scanner;
 public class Test4 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
     }
     int number = sc.nextInt();
     boolean value = false;
     for(int i=0;i<arr.length;i++){
      if(arr[i]>number){
        System.out.print(arr[i]+" ");
        value = true;
      }
     }
     if(!value){
      System.out.println("No any big arrays are present");
     }
  }
}
