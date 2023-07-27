import java.util.*;
public class SortedString {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    char ch [] = {'R','W','B','B','R','W','W','B'};
    solution(ch);
  }
  public static void solution(char ch[]){
    int count = 0;
    for(int i=0;i<ch.length;i++){
      if(ch[i]=='W'){
        count++;
        System.out.print(ch[i]+" ");
      }

    }
    int count2 =0;
    for(int i=0;i<ch.length-count;i++){
      if(ch[i]=='B'){
        count2++;
        System.out.print(ch[i]+" ");
      }
    }
    for(int i=0;i<ch.length-(count+count2);i++){
      System.out.print("R"+" ");
    }
  }

}
