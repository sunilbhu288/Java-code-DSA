import java.util.*;
public class Stack3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
   if(isTrueOrFalse(str)){
    System.out.println("Yes");
   }
   else{
    System.out.println("No");
   }
    

}
public static boolean isTrueOrFalse(String str ){
  Stack<Character>st = new Stack<>();
  for(int i=0;i<str.length();i++){
    char ch = str.charAt(i);
  if(ch == '(' || ch == '{' || ch == '['){
       st.push(ch);
    }
    else{
      if(st.isEmpty()){
        return false;
      }
      if(ch == '(' && st.peek()==')')
      return true;
      else if(ch == '{' && st.peek()=='}')
      return true;
      else if(ch == '[' && st.peek()==']')
      return true;
      else
      st.pop();
    }
  }
  return true;
}
}
