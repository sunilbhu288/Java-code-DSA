public class Sortedarray1 {
  public static void main(String []args){
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 10;
    int i=0;
    int j = arr.length-1;
    while(i<j){
      if(arr[i]+arr[j]==k){
        System.out.print(i+" "+j);
        i++;
        j--;
      }
      else if(arr[i]+arr[j]>k){
        j--;
      }
      else if(arr[i]+arr[j]<k){
        i++;
      }
      else{
        System.out.println("Pair not found");
      }
    }
  }
}
