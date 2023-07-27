import java.util.Scanner;
public class Test72 {
public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
  }
  int k = sc.nextInt();
  int sum = 0;
  boolean flag = false;
  for(int i=0; i<n; i++){
    for(int j=i; j<n; j++){
      sum = sum + arr[j];
      if(sum == k){
        System.out.print(i+" "+j);
        flag = true;
        break;
      }
    }
  }
  if(!flag){
    System.out.println("not found");
  }
}

}
