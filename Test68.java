import java.util.Scanner;
public class Test68 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    
    //int j = arr.length-1;
    int i=0;
    while( i<n){
        i=0;
      if(arr[i]==k){
        System.out.println(arr[i]);
        break;
      }
      else{
        System.out.println(arr[i+1]);
        i++;
      }
    }
  }
}

