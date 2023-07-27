// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Arrays;
// don't change the name of this class
// you can add inner classes if needed
class ArraysDemo6 {
    public static void main (String[] args) {
                      // Your code here
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
      while(t>0){
           int size = sc.nextInt();
           int arr[] = new int [size];
           for(int i=0;i<size;i++){
               arr[i] = sc.nextInt();
           }
           System.out.println(ArrayMaxAndMin(arr));
           t--;
      }
       } 
       public static int ArrayMaxAndMin(int []arr){
       int max = arr[0];
       int min =  arr[0];
       for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
               max = arr[i];
           
       
           //System.out.print(max+" ");
           return max;
           }
          // for(int i=0;i<arr.length;i++){
           if(min>arr[i]){
               min = arr[i];
        
           return min;
           }
      // System.out.println();           
    }
    System.out.println(max+" "+min);
       }
}