public class Test38 {
  public static void main(String []args){
    int arr[] = {-5,4,6,-3,-4,1};
    int max_sum = Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
      int sum =0;
      for(int j=0;j<arr.length;j++){
        sum = sum + arr[j];
        
      }
      max_sum = Math.max(sum,max_sum);
    }
    
    System.out.println(max_sum);
    
  }
}
