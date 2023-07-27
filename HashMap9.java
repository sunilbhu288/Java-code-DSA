import java.util.*;
public class HashMap9 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(solution(s));
  }
  public static int solution(String s){
    HashMap<Character,Integer>map = new HashMap<>();
    for(char ch : s.toCharArray()){
      map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(map.get(ch)==1){
        return i;
      }
    }
    return -1;
  }
}
