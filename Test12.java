import java.util.Scanner;
public class Test12 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    while(t>0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      
      int i,j;
    for( i=0;i<arr.length;i++){
        for( j=i+1;j<arr.length;j++){
          if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
    }
    System.out.println(arr[i]+"");
    t--;
  }
}
}
