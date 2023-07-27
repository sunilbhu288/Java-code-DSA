import java.util.Scanner;
public class ModulusMultiplicativeInverse {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m = sc.nextInt();
    int ans = findMMI(a,m);
    System.out.println(ans);
  }
  public static int findMMI(int a, int m){
    for(int i=1;i<m;i++){
      if((a*i)%m==1){
        return i;
      }
    }
    return 0;
  }
}
