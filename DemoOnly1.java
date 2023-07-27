public class DemoOnly1 {
  public static void main(String []args){
    int arr[] = {2,1,3,5,4,6,7,8,9};
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        count++;
        System.out.print(arr[i]+" ");
      }
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        System.out.print(arr[i]+" ");
      }
    }
  }
}
