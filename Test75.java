public class Test75 {
  public static void main(String []args){
    int arr[] = {2,3,5,7,8,10};
    int k = 11;
    int l = 0;
    int h = arr.length-1;
    int m = l+(h-l)/2;
    boolean flag = false;
    while(l<h){
      if(arr[m]==k){
        System.out.println(m);
        flag = true;
        break;
      }
      if(arr[m]<k){
         l = m+1;
      }
      else{
        h = m-1;
      }
    }
    if(!flag){
      System.out.println("No element found");
    }
  }
}
