import java.util.*;
public class CountNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solution(n));
  }
  public static int solution(int n){
    int count = 0;
    for(int i=1;i<n;i++){
      while(i>0){
        int num = i%10;
        if(num==9){
          count++;
        }
        i = i/10;
      }
      //System.out.print(count);
    }
    return count;
    
  }
}
