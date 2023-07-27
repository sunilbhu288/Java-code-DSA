public class OnlyTest43 {
  public static void main(String []args){
    int arr[] = {3,5,7,10,14,23,35};
   int l = 0;
   int h = arr.length-1;
    int k = 23;
    checkMid(arr,l,h,k);
  }
  public static void checkMid(int arr[], int l, int h, int k){
    
    int mid = l + (h-l)/2;
    while(l<=h){
      if(arr[mid]==k){
           System.out.print("Index:"+mid);
           break;
      }
      if(arr[mid]>k){
        h = mid-1;

      }
      else{
        l = mid+1;
      }
    }
  }
}
