import java.util.*;
public class HashMap8 {
  public static void main (String[] args) {
    // Your code here
Scanner sc = new Scanner(System.in);
String str = sc.next();
char ch [] = str.toCharArray();
System.out.println(findFirstNonRepeate(ch));

}
public static int findFirstNonRepeate(char ch[]){
HashMap<Character,Integer>map = new HashMap<>();
for(int i=0;i<ch.length;i++){
if(map.containsKey(ch[i])){
int freq = map.get(ch[i]);
map.put(ch[i],freq+1);
}
else{
map.put(ch[i],1);
}
}
for(Map.Entry<Character,Integer>maEntry : map.entrySet()){
int key = maEntry.getKey();
if(key>1){
return 1;
}
}
return -1;
}
}

