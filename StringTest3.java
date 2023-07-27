import java.util.Arrays;
import java.util.Scanner;
public class StringTest3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
     int s1 = sc.nextInt();
     int s2 = sc.nextInt();
     int arr1[] = new int [s1];
     int arr2[] = new int[s2];
     for(int i=0;i<arr1.length;i++){
      arr1[i] = sc.nextInt(); 
     }
     for(int j=0;j<arr2.length;j++){
      arr2[j] = sc.nextInt();
     }
     
     int c1 = arr1.length + arr2.length;
     int c[] = new int [c1];
     for(int i=0;i<arr1.length;i++){
      c[i] = arr1[i];
     }
     for(int i=0;i<arr2.length;i++){
      c[arr1.length+i] = arr2[i];
     }
     Arrays.sort(c);
     for(int i=0;i<c1;i++){
      //System.out.println(c[i]+" ");

    // }
     int len = c.length;
     int p = len/2;
     if(len%2==0){
        double k = (c[p]+c[(p+1)])/2;
        System.out.println(k);
     }
     else{
      double r = c[(p+1)]/2;
      System.out.println(r);
     }
    }
  }
}
