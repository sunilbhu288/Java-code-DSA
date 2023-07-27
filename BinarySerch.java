public class BinarySerch {
  public static void main(String []args){
    int arr[] = {0,0,0,0,1,1,1,1,2,2};
    int num = 0;
    int l =0;
    int h = arr.length-1;

    findMid(arr,l,h,num);
  }
  public static void findMid(int arr[], int l, int h, int num){
    
    while(l<=h){
      int m = l+(h-l)/2;
      if(arr[m]==num){
        System.out.println(m);
        break;
      }
      if(arr[m]>num){
        h = m-1;
      }
      else{
        l = m+1;
      }
    }
  }
}
