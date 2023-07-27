import java.util.*;
public class DemoPractice1 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    findTargetElements(arr,n,p);
}
public static void findTargetElements(int arr[], int n, int p){
    boolean flag = false;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==p){
                    System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                    flag = true;
                    break;
                }
            }
        }
    }
    if(!flag){
        System.out.print("element are not found");
    }
}
}

