import java.util.*;
import java.util.Scanner;
public class DemoOnly2 {
  public static void main(String []args){
   // Scanner sc = new Scanner(System.in);
    String str = "???abscf?dg";
    //System.out.println(str.replaceAll("?",""));

  }
  public static void printString(String str){
    char ch []= str.toCharArray();
    String st = "";
    for(int i=0;i<ch.length;i++){
      if(ch[i]!='?'){
        st = st + ch[i];
      }
    }
    System.out.println(st);
  }
}
