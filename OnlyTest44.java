import java.util.Scanner;
public class OnlyTest44 {
  public static void mian(String []args){
  Scanner sc = new Scanner(System.in);
  String str = sc.next();
  char ch[] = str.toCharArray();
  for(int i=0;i<ch.length;i++){
  System.out.print(ch[1]+""+ch[0]);
  }
}
}
