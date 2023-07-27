import java.util.Scanner;
public class OnlyTest4 {
  public static void main(String [] args){
    Scanner inputTaker = new Scanner(System.in);
    int n = inputTaker.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = inputTaker.nextInt();
      
    }
    sort(arr,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

  }
  public static void sort(int arr[],int l, int h){
    if(l>=h){
      return;
    }
    int m = l + (h-l)/2;
    sort(arr,l,m);
    sort(arr,m+1,h);
    merge(arr,l,m,h);
  }
  public static void merge(int arr[],int l, int m,int h){
    int n1 = m-l+1;
    int n2 = h-m;
    int [] left = new int[n1];
    int [] rigth = new int[n2];
    for(int i=0;i<n1;i++){
      left[i] = arr[l+i];
    }
    for(int i=0;i<n2;i++){
      rigth[i] = arr[m+1+i];
    }
    int i=0;
    int j=0;
    int k=l;
    while(i<n1 && j<n2){
      if(left[i]<=rigth[i]){
        arr[k] = left[i];
        i++;
      }
      else{
        arr[k] = rigth[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k] = left[i];
      k++;
      i++;
    }
    while(j<n2){
      arr[k] = rigth[j];
      k++;
      j++;
    }
  }
}
