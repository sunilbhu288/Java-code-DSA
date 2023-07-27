import java.util.Scanner;
public class OnlYTest48 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    divide(arr, 0, arr.length-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void divide(int arr[], int l, int h){
    if(l<h){
    int m = l+(h-l)/2;
    divide(arr, l, m);
    divide(arr, m+1,h);
    merge(arr, l, m, h);
    }

  }
  public static void merge(int arr[], int l, int m ,int h){
   int n1 = m-l+1;
   int n2 = h-m;
   int left[] = new int [n1];
   int right[] = new int[n2];
   for(int i=0;i<n1;i++){
    arr[i] = left[i+l];
   }
   for(int i=0;i<n2;i++){
    arr[i] = right[m+1+i];
   }
   int i=0;
   int j=0;
    int k =l;
    while(i<n1 && j<n2){
      if(left[i]<right[j]){
        arr[k] = left[i];
        i++; 
      }
      else{
        arr[k] = right[j];
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
      arr[k] = right[j];
       k++;
       j++;
    }
  }
}
