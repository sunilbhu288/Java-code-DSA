import java.util.*;
public class StringBuilder1 {
  public static void main(String args[]){
     Scanner sc =  new Scanner(System.in);
     String str = sc.next();
     solution(str);
  }
  public static void solution(String str){
    StringBuilder sb = new StringBuilder();
    char ch [] = str.toCharArray();
    for(int i=0;i<str.length();i++){
      if(ch[i]=='l'){
        sb.setCharAt(i,'k');
      }
    }
    System.out.println(sb);
  }
}
