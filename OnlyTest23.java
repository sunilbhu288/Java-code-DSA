import java.util.Scanner;
public class OnlyTest23 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int rev =0;
    if(isPalindrome(rev,n,temp)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
  public static boolean isPalindrome(int rev, int n,int temp){
    while(n>0){
      rev = rev*10 + n%10;
      n = n/10;
      if(rev==temp){
        return true;
      } 
    }
      return false;
    
  }
}
