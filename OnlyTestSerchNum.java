public class OnlyTestSerchNum {
  public static void mian(String []args){
    int arr[] = {3,5,2,9,4,6,1};
    for(int i=0;i<arr.length-1;i++){
      for(int j = i+1;j<arr.length-1;j++){
        if(arr[j]>arr[j+1]){
          int temp= arr[j];
            arr[j] = arr[j+1];
            arr[j+1]= temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
