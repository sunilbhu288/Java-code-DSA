import java.util.*;
public class Test26 {
  public static void main(String []args){
    int arr[] = {2,3,4,3,5,0,3,2};
    HashSet<Integer> set =new HashSet<>();
    int sum=0;
    for(int i=0; i< arr.length;i++){
      if(!set.contains(arr[i])){
        sum+=arr[i];
        set.add(arr[i]);
      }
      
    }
      

      // for(int ele: set)
      //   sum+=ele;
    System.out.println(set.size()+" "+sum);
    // int count =0;
    // for(int i=0;i<arr.length;i++){
    //   boolean flag=true;
    //   for(int j=0;j<i;j++){
    //     if(arr[i]==arr[j]){
    //       flag=false;
    //       break;
    //     }
    //   }
    //   if(flag == true)
    //   count++;
    // }
    // System.out.println(count);
  }
}
