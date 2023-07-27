import java.util.Scanner;
public class Test8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org_num =n;
        int rev =0;
      //  n = rev;
        while(n>0){
             rev = rev*10 + n%10;
             n=n/10;
        }
        if(rev==org_num){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("Non Palindrome");
        }
    }
}
