public class MockInterview5 {
  public static void main(String []args){
   int arr[] = {1,3,5,6,7};
   int n = arr.length;
   
  }
  public static int sumOfArray(int arr[], int n){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
    sum = sum + arr[i];
    }
    return sum;
  }
  public static void findTwoMissingNum(int arr[], int n){
      int sum2 = (n*(n+1)/2 - sumOfArray(arr,n));
      System.out.println(sum2);
  }
}
