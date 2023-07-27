public class Test66 {
  public static void main(String []args){
    int arr[] = {1,0,0,0,1,1,0,1,0,1,1};
    sort(arr);

  }
  public static void sort(int arr[]){
    int j =-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<1){ 
        j++;
        swap(arr,i,j);
      }
      System.out.print(arr[i]+" ");
    }
  }
  public static void swap(int arr[], int i, int j ){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    
  }
}
