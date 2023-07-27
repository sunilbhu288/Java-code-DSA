public class Demo10 {
  public static void main(String []args){
    int arr[] = {1,3,-2,-4,5,6,-8,5,4,-2};
    int currentSum = 0;
    int maxSum = 0;
    for(int i=0;i<arr.length;i++){
      currentSum = currentSum + arr[i];
      if(currentSum > maxSum){
          maxSum = currentSum;
      }
      if(currentSum<0){
        currentSum = 0;
      }
    }
    System.out.println(maxSum);
  }
}
