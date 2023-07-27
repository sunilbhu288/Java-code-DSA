import java.util.*;
public class StringProblems2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    reverseString(str1);

  }
  public static void reverseString(String str1){
     String str2 = "";
     char ch [] = str1.toCharArray();
     for(int i=str1.length()-1;i>=0;i--){
        str2 = str2 + ch[i];
     }
     int count=0;
     for(int i=0;i<str1.length();i++){
      if(str1.charAt(i)==str2.charAt(i)){
        count++;
      }
     }
     System.out.println(count);
  }
}
