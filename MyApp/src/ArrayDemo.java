import java.util.Arrays;
public class ArrayDemo {
     public static void main(String [] args){
       // Scanner sc = new Scanner (System.in);
       int arr[] = {1,2,3,2,4,3,5};
       Arrays.sort(arr);
       int j=0; int i;
       for( i=0;i<arr.length-1;i++){
        //System.out.print(arr[i]+" ");
        if(arr[i]!=arr[i+1]){
            arr[j++]=arr[i];
        }
        arr[j++]=arr[arr.length-1];
       }
       System.out.print(arr[i]+" ");
     }
}
