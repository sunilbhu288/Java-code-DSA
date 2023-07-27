import java.util.Scanner;
public class StringPalindrome {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String rev = "";
    char ch [] = str.toCharArray();
    for(int i = str.length()-1;i>=0;i--){
      rev = rev + ch[i];
    }
    if(str.equals(rev)){
      System.out.println("palindrome");
    }
    else{
      System.out.println("not palindrome");
    }
  }
}
