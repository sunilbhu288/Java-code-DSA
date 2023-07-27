import java.util.*;
public class StringPalindromUsingStack {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if(isPalindrom(str)){
      System.out.println("palindrome");
    }
    else{
      System.out.println("Non Palindrome");
    }
  }
  public static boolean isPalindrom(String str){
     Stack<Character>st = new Stack<>();
      String rev = "";
     char ch[] = str.toCharArray();
     for(int i=0;i<ch.length;i++){
         st.push(ch[i]);
     }
     while(!st.isEmpty()){
       rev = rev + st.pop();
     }
     if(str.equals(rev)){
      return true;
     }
     return false;
  }
}
