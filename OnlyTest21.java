import java.util.Scanner;
public class OnlyTest21 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev =0;
    int temp = n;
    if(isPalindrome(n,rev,temp)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
  public static boolean isPalindrome(int n,int rev,int temp){
   
   while(n>0){
    rev = rev*10 + n%10;
    n = n/10;
   }
   if(temp==rev){
    return true;
   }
   else{
   return false;
   }
  }
  
}
