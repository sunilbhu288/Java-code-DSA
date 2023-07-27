import java.util.Scanner;

public class Test21 {
  public static int solve(String s) {
    int starcount = 0, hashcount = 0
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        starcount++;
      }
      // else if(s.charAt(i)=='b'){
      // hashcount++;
      // }
    }
    return starcount;
    // return hashcount;
  }

       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = solve(s);
    System.out.println(ans);
  }
}
