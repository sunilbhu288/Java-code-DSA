 import java.util.*;
public class StringTest1 {
  public static void main(String []args){
    String str = "hello";
    
    char []ch = str.toCharArray();
     
    int left = 0;
    int right = ch.length-1;
    while(left<right){
      char temp = ch[left];
      ch[left] = ch[right];
      ch[right] = temp;
    }
    for(int i=0;i<ch.length;i++){
      System.out.print(ch[i]+" ");
    }
     
  }
}
