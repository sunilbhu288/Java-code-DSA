
public class OnlyTest55 {
  public static void main(String []args){
    
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
       int k = 5;
       int l =0;
       int h = arr.length-1;
       findNum(arr,l,h,k);

  }
  public static void findNum(int arr[],int l,int h,int k){
    int m = l+(h-l)/2;
    if(arr[m]==k){
      System.out.println("index "+m);
    }
    if(arr[m]>k){
      h = m-1;
    }
    else{
      l = m+1;
    }
  }
}
