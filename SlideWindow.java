public class SlideWindow {
  public static void main(String []args){
    int arr[] = {1,2,4,3,6,5,7,1,9,3};
    int k = 3;
    int maxSum = 0;
    int sum = 0;
    for(int i=0;i<arr.length-k;i++){
       for(int j =i;j<k+i;j++){
        sum = sum + arr[j];
       }
       if(sum>maxSum){
        maxSum = sum;
       }
       
    }
    System.out.println(maxSum);
  }
}
