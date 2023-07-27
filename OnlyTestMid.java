public class OnlyTestMid {
  public static void main(String []args){
    int arr[] = {3,5,7,13,25,45};
    int l = 0;
    int h = arr.length-1;
    int k = 25;
    findMid(arr,l,h,k);
  }
  public static void findMid(int arr[], int l, int h, int k){
    
    while(l<=h){
      int mid = l+(h-l)/2;
    if(arr[mid] == k){
      System.out.println("index: "+mid);
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
