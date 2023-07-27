public class MockInterviewMedium1 {
  public static void main(String []args){
    int arr[] = {12,10,8,6,4,2,0};
    int target = 12;
    int l = 0;
    int h = arr.length-1;
    while(l<=h){
      int m = l+(h-l)/2;
      if(arr[m]==target){
        System.out.println(m);
        break;
      }
      if(arr[m]>target){
          l = m+1;
      }
      else{
        h = m-1;
      }
    }
    
  }
}
