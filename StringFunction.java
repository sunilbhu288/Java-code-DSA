import java.util.Scanner;
public class StringFunction {
  public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     if(isPalindromeOrNot(str)){
      System.out.println("palindrome");
     }
     else{
      System.out.println("Non palindrome");
     }
  }
  public static boolean isPalindromeOrNot(String str){
    String rev = "";
    char ch [] = str.toCharArray();
    for(int i=str.length()-1;i>=0;i--){
     
      rev = rev + ch[i];
    }
    if(str.equals(rev)){
      return true;
    } 
    return false;
  }
  
}
