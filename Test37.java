import java.util.*;
import java.util.Scanner;
public class Test37 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch [] = str.toCharArray();
    int j=0;
    Arrays.sort(ch);
    for(int i=0;i<ch.length-1;i++){
      
      if(ch[i]!=ch[i+1]){
        ch[j]=ch[i];
        j++;
      }
    //  System.out.print(ch[i]+" ");
    }
    ch[j] = ch[ch.length-1];
    j++;
    for(int k=0;k<j;k++){
      System.out.print(ch[k]+" ");
    }
  }
}
