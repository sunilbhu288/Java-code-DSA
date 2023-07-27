import java.util.Scanner;
public class ModuleExponention {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int p = sc.nextInt();
     int ans = moduleExp(x,y,p);
     System.out.println(ans);
  }
  public static int moduleExp(int x, int y, int p){
    int result = 1;
   // x = x%p;
    if(y==0){
      return 1;
    }
    while(y>0){
      if(y%2!=0){
        result = (result*x)%p;
      }
      x = (x*x)%p;
      y = y/2;
    }
    return result;
  }
}
