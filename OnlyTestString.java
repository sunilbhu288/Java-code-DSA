import java.util.Scanner;
public class OnlyTestString {
  public static void main(String [] arsg){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // String v = "";
    // char ch[] = str.toCharArray();
    // for(int i=0;i<str.length()-1;i++){
    //   v = v + ch[i];
      
    // }
    // System.out.println(v);
    for(int i=0;i<str.length();i++){
    System.out.print(str.charAt(i)+" ");
    }
  }
}
