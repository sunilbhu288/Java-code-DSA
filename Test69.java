import java.util.Scanner;
public class Test69 {
  public static void main(String []args){
    // Scanner sc= new Scanner(System.in);
    // int n = sc.nextInt();
    int arr[] = {2,3,5,6,8,9,15,17};
    int k = 8;
    int l=0;
    int h = arr.length-1;
    while(l<h){
      int m = l+(h-l)/2;
      if(arr[m]==k){
        System.out.println(m);
      }
      if(arr[m]>k){
        h = m-1;
      }
      else{
        l = m+1;
      }
    }
    
  }
}
