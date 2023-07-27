import java.util.Scanner;
public class NewtonDemo {
  public static void main (String[] args) {
    // Your code here
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
    int arr[] = new int[n];
  for(int i=0;i<arr.length;i++){
   arr[i] = sc.nextInt();
 }
     System.out.println(gcdNumber(n,arr));

}
     public static int gcdNumber(int n ,int arr[]){
   for(int i=0;i<n;i++){
    if(n%arr[i]==0){
       return arr[i];
    }
  
     return gcdNumber(arr[i],n%arr[i]);
  }
   }
}

