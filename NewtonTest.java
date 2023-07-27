public class NewtonTest {
  public static void main(String []args){
    int arr[] = {2,3,41,5,7,9,10,24};
    int target = 16;
    boolean flag = false;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==target){
          System.out.println(arr[i]+" "+ arr[j]);
          flag = true;
          break;
        }
      }
    }
    if(!flag){
      System.out.println("element no found");
    }
  }
}
