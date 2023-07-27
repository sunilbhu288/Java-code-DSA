import java.util.*;
public class ReverseStringUsingstack {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    findReverseString((str));
  }
  public static void findReverseString(String str){
    Stack<Character>st = new Stack<>();
    String rev = "";
    char ch [] = str.toCharArray();
    for(int i=0;i<ch.length;i++){
      st.push(ch[i]);
    }
     while(!st.isEmpty()){
      rev = rev + st.pop();
     }
     System.out.println(rev);
  }
}
