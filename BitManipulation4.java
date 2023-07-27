import java.util.Scanner;
public class BitManipulation4 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int result =1;
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr.length;j++){
        //System.out.print((arr[i]^arr[j])+" ");
       result = arr[i]^arr[j];
      }
    }
    System.out.print(result+" ");
  }
}
