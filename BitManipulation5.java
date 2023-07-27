import java.util.Scanner;
public class BitManipulation5 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int count=0;
    int i,j;
    for( i=0;i<arr.length;i++){
      for( j =1+i;j<arr.length;j++){
        if((arr[i]==arr[j])){
      
           count ++;
          // break;
        }
      }
    }
    System.out.println(count);
  }
}
