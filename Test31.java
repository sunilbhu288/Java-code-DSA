public class Test31 {
  public static void main(String []args){
    int arr[] = {1,0,0,1,0,1,1,0};
    int i=0;
    int j =-1;
    while(i<arr.length && j<arr.length){
    if(arr[i]>1){
     j++;
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }
  }
   System.out.print(arr[i]+" ");
  }
  
}
