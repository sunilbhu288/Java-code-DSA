import java.util.Scanner;
public class StringDemo4 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr[] = new String[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.next();
    }
     longestPrefix(arr);
    //System.out.println(ans);
  }
  public static void longestPrefix(String []arr){
    String first = arr[0];
    for(int i=1;i<arr.length;i++){
      String current = arr[i];
      int j=0;
      while(j<first.length() && j<current.length() && first.charAt(j)==current.charAt(j)){
        j++;
      }
      if(j==0){
       // return "";
       System.out.println("no comman prifix");
      }
      else{
        first = current.substring(0,j);
      }
    }
    //return first;
    System.out.println(first);
  }
}
