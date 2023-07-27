import java.util.Scanner;
public class Test36 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch[] = str.toCharArray();
    int j=0;
    for(int i=0;i<ch.length-1;i++){
      if(ch[i]!=ch[i+1]){
       ch[j] = ch[i];
       j++;
      }
    }
    ch[j]=ch[ch.length-1];
    j++;
    for(int k=0;k<j;k++){
      System.out.print(ch[k]+" ");
    }
  }

}
