public class Test65 {
  public static void main(String []args){
    int arr[] = {2,3,4,6,8,9,13,23,33};
    int num = 13;
    int l = 0;
    int h = arr.length-1;
    while(l<=h){
      int m = l+(h-l)/2;
      if(arr[m]==num){
        System.out.println(m);
        l++;
        h--;
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

