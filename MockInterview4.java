public class MockInterview4 {
  public static void main(String []args){
    int arr[] = {0,0,0,0,1,1,1,1,2,2};
    int num = 0;
    int i = 0;
    int j = arr.length-1;
    while(i<arr.length && j<arr.length){
      if(arr[i]+arr[j]==num){
        System.out.print(arr[i]+" "+arr[j]);
        break;
      }
      else if(arr[i]+arr[j]>num){
        j--;
      }
      else{
        i++;
      }
    }
  }
}
