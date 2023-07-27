public class Test76 {
  public static void main(String []args){
    int arr[] = {2,3,5,6,8,10,13,15,16,20};
    int k = 6;
    int l =0;
    int h = arr.length-1;
    while(l<=h){
      int m = l+(h-l)/2;
      if(arr[m]==k){
        System.out.println(m);
        break;
      }
      if(arr[m]>k){
        h = m-1;
      }
      else{
        l = m+1;
      }
    }
  }
}
