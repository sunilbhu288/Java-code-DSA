import java.util.Scanner;
public class OnlyTest26 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    int l =0;
    int h= arr.length-1;
    while(l<=h){
      int mid = l + (h-l)/2;
      if(arr[mid]==k){
        System.out.println("index of number: "+mid+" ");
        break;
      }
      if(arr[mid]>k){
        h = mid-1;
      }
      else{
        l =mid+1;
      }
      System.out.println(l+" , "+h);
    }
  }
}
