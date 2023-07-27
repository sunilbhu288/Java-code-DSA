import java.util.Scanner;
public class Test74 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
     arr[i] = sc.nextInt();
    }
    devide(arr,0,arr.length-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void devide(int arr[], int l, int h){
    if(l<h){
    int m = l+(h-l)/2;
    devide(arr,l,m);
    devide(arr,m+1,h);
    merge(arr,l,m,h);
    }
  }
  public static void merge(int arr[],int l, int m, int h){
    int n1 = m-l+1;
    int n2 = h-m;
    int left[] = new int[n1];
    int right[] = new int[n2];
    for(int i=0;i<n1;i++){
      left[i] = arr[l+i];
    }
    for(int i=0;i<n2;i++){
      right[i] = arr[m+1+i];
    }
    int i = 0;
    int j = 0;
    int k = l;
    
    while(i<n1 && j<n2){
      if(left[i]<=right[j]){
        arr[k]=left[i];
        i++;
      }
      else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k] = left[i];
      i++;
      k++;
    }
    while(j<n2){
      arr[k] = right[j];
      j++;
      k++;
  }
}
}
