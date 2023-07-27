public class Test70 {
  public static void main(String []args){
    int arr[] = {-2,-1,-2,-1,-2};
    int sum = 0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]>0){
        sum = sum + arr[i];
       }
    }
    if(sum>0)
    System.out.println(sum);
    else
    System.out.print("-1");
  }
}
