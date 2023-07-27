public class Test77 {
  public static void main(String []args){
    int arr[] = {0,1,1,0,0,0,0,1,0};
    int j=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<1){
        j++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
