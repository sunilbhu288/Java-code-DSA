public class Test28 {
  public static void main(String args[]){
    int arr[] = {1,2,5,6,13};
    for(int i=0;i<arr.length-1;i=i+2){
      if(arr[i]!=arr[i+1]){
        System.out.print(arr[i]-1);
      }
    }
  }
}
