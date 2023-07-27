public class Test64 {
  public static void main(String []args){
    int arr[] = {6,3,2,7,6,4,9};
    bubbuleSort(arr);
  }
  public static void bubbuleSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j = 0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
