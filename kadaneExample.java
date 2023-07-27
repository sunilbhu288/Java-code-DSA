public class kadaneExample {
  public static void main(String []args){
    int arr[] = {5,-4,-2,6,-1,5};
    System.out.println(findMaxsubArray(arr));

  }
  public static int findMaxsubArray(int arr[]){
    int maxsum=0;
    int currentSum=0; 
    for(int i=0;i<arr.length;i++){
      currentSum = currentSum+arr[i];
      if(currentSum>maxsum){
        maxsum = currentSum;
      }
      if(currentSum<0){
        currentSum = 0;
      }

    }
    return maxsum; 
  }
}
