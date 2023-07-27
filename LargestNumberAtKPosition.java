public class LargestNumberAtKPosition {
  public static void main(String []args){
    int arr[] = {2,3,1,6,5,0,10,21,4,7,9};
    int k=6;
    AtPosition(arr,k);

  }
  public static void AtPosition(int arr[],int k){
    for(int i=0;i<arr.length-1;i++){
       for(int j=i;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
       }
       if(i==k){
        System.out.println(arr[i]);
        break;
       }
    }
  }
}
