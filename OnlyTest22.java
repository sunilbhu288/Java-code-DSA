import java.util.Scanner;
public class OnlyTest22 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int [n];
    
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    int l = 0;
    int h = arr.length-1;
    while(l<=h){
      int mid = l+(h-l)/2;
      if(arr[mid]==num){
        System.out.println("index of num: "+mid);
        break;
      }
      if(arr[mid]>num){
        h = mid-1;
      }
      else{
        l = mid+1;
      }
    }
  }
}
