import java.util.*;
public class StringLongestPrefix {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr[] = new String[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.next();
    }
    String ans = longestPrefix(arr);
    System.out.println(ans);
  }
  public static String longestPrefix(String []arr){
    if(arr==null || arr.length==0){
      return "";
    }
    String lcp = arr[0];
    for(int i=1;i<arr.length;i++){
      String currntWord = arr[i];
      int j = 0;
      while(j<lcp.length() && j<currntWord.length() && lcp.charAt(j)==currntWord.charAt(j)){
        j++;
      }
      if(j==0){
        return "";
      }
      else{
          lcp = currntWord.substring(0,j); 
      }
    }
    return lcp;
  }
}
