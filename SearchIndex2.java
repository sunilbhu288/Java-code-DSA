import java.util.Scanner;
public class SearchIndex2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
   int index = 9;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] =sc.nextInt();
    }
    boolean casefind = false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==index){
        System.out.println(i+" ");
        casefind = true;
      }
      
    }
    if(casefind==false){
      System.out.println("Number is not found");
    }
}
}