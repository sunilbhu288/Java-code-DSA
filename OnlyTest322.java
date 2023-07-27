public class OnlyTest322 {
  public static void  main(String []args){
    int arr[] = {0,1,1,0,0,1};
    int n = arr.length;
    int count =0;

    for(int i=0;i<n;i++){
      if(arr[i]==0){
        count++;
      }
    }
    for(int i=0;i<count;i++){
      System.out.print("0");
    }
    for(int i=0;i<n-count;i++){
      System.out.print("1");
    }
  }
}
