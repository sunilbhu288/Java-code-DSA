public class Demo8 {
  public static void main(String []args){
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    int k = 2;
    rotate(arr,k,n);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void reverse(int arr[], int i, int j){
    int l = i;
    int h = j;
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
  public static void rotate(int arr[], int k, int n){
    reverse(arr,0,n-k);
    reverse(arr,k,n-1);
    reverse(arr,0,n-1);
  }
}

