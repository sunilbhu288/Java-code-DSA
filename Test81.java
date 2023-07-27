import java.util.Scanner;
public class Test81 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     String str = sc.next();
     char ch[] = str.toCharArray();
     int max = 0;
     
     for(int i=0;i<n;i++){
      int count = 1;
      for(int j = i+1;j<n;j++){
       if(ch[i]!=ch[j]){
           count++;
       }
     }
     if(max<count){
      max = count;
     }
    }
     System.out.println(max);
  }
}
