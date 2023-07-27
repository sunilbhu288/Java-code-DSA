import java.util.*;
public class ExamQuestion1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(maxCount(n));
  }
  public static int maxCount(int n){
    String str = Integer.toString(n);
    int max = 0;
     int i=0;
    for( i=0;i<str.length()-1;i++){
      int count=0;
       for(int j= i+1;j<str.length();j++){
           if(str.charAt(i)==str.charAt(j)){
              count++;
            }
           }
           if(count>max){
            max = count;
       }
       
    }
    System.out.println(str.charAt(i));
    return max+1;
  }
}
