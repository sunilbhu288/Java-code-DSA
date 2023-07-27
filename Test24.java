public class Test24 {
  public static void main(String []args){
    int arr[]= {0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0};
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        System.out.print("0"+" ");
        count++;

      }
      

      }
      for(int i=0;i<arr.length-count;i++){
        System.out.print("1"+" ");
    }
  }
}
