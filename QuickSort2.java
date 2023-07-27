public class QuickSort2 {
  public static void main(String []args){
    int arr[] = {2,5,3,1,8,6,9,12};
    quickSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }
  public static void quickSort(int arr[], int low, int high){
    if(low<high){
      // int pivot = partition(arr,low,high);
      // quickSort(arr,low,pivot-1);
      // quickSort(arr,pivot+1,high);
      partition(arr,low,high);
    }
  }
  public static void partition(int arr[],int low,int high){
    int pivot = arr[low];
    int i = low;
    int j = high;
    
    while(i<j){
      while(arr[i]<pivot) i++;
      while(arr[j]>pivot) j--;
      if(i<j){
       int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      }
    }
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // return i;
  }
}
