import java.util.*;
public class StringReverseUsingQueue {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 
    boolean ans =  isPalindrome(str);
    if(ans==true){
      System.out.println("palindrome");
    }
    else{
      System.out.println("Non Palindrome");
    }
  }
  public static boolean isPalindrome(String str){
    Queue<Character>qq = new LinkedList<>();
    String rev = "";
    char ch[] = str.toCharArray();
    for(int i=ch.length-1;i>=0;i--){
      qq.add(ch[i]);
    }
    while(!qq.isEmpty()){
        rev = rev + qq.poll();
    }
   if(str.equals(rev)){
      return true;
   }
  //  
  return false;
  }
}
