import java.util.Scanner;
public class OnlyTest3221 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int size1 = sc.nextInt();
    int i;
    int j;

    int arr1[] = new int[size1];
    for( i=0;i<size1;i++){
      arr1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    for( j=0;j<n2;j++){
      arr2[j] = sc.nextInt();
    }
    if(size1>n2){
   for( i=0;i<size1;i++ ){
     if(arr1[i]==arr2[j]){
      System.out.print(arr2[i]);
     }
   }
    }
  }
}
