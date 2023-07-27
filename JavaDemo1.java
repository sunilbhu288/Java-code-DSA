import java.util.*;
public class JavaDemo1 {
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     char ch [] = str.toCharArray();
     printSolution(str,ch);
  }
  public static void printSolution(String str, char ch[]){
    HashMap<Character,Integer>map = new HashMap<>();
    
    for(int i=0;i<str.length();i++){
       if(map.containsKey(ch[i])){
        int f = map.get(ch[i]);
        map.put(ch[i],f+1);
       }
       else{
        map.put(ch[i],1);
       }
    } 
     for(Map.Entry<Character,Integer> val : map.entrySet()){
       char key = val.getKey();
       int value = val.getValue();
       System.out.println(key +" " + value);
     }
    
  }
}
