import java.util.Scanner;
public class MergeSort {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    conquir(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }
  public static void conquir(int arr[], int low, int high){
    if(low<high){
    int mid = low+(high-low)/2;
    conquir(arr, low, mid);
    conquir(arr, mid+1,high);
    divide(arr,low,mid,high);
    }
  }
  public static void divide(int arr[], int low, int mid, int high){
  int n1 = mid-low +1;
  int n2 = high-low;
  int left[] = new int[n1];
  int right[] = new int[n2];
  for(int i=0;i<n1;i++){
    arr[i] = left[low+i];
  }
  for(int i=0;i<n2;i++){
    arr[i] = right[mid+1+i];
  }
  int i=0;
  int j=0;
  int k = low;

  while(low<n1 && high<n2){
    if(left[i]<=right[j]){
      arr[k] = left[i];
      i++;
    }
    else{
      arr[k] = right[j];
      j++;
    }
    k++;
  }
  while(low<n1){
    arr[k] = left[i];
    k++;
    i++;
  }
  while(high<arr[j]){
    arr[k] = right[j];
    k++;
    j++;
  }

  }
}
