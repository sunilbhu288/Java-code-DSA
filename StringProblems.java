import java.util.Scanner;
public class StringProblems {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch [] = str.toCharArray();
    int count;
    boolean value = false;
    for(int i=0;i<str.length();i++){
      count=0;
      for(int j=i+1;j<str.length();j++){
        if(ch[i]==ch[j]){
          System.out.println(ch[i]);
          value = true;
          count++;
        }
      }
     //bana System.out.println(count);
  }
    }
    
}
