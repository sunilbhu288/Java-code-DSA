public class QuickSort {
  public static void main(String []args){
    int arr[] = {8,4,7,1,2,0,3,6,5};
    quickSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }
  public static void quickSort(int arr[],int low,int high){
    if(low<high){
      int pivot = partition(arr,low,high);
      quickSort(arr,low,pivot-1);
      quickSort(arr,pivot+1,high);
    }
  }
  public static int partition(int arr[],int low,int high){
    int pivot = arr[high];
    int i= low;
    for( int j=low; j<high;j++){
      if(arr[j]<pivot){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      }
    }
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high]=temp;
    return i;
  }
}
