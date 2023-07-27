import java.util.Scanner;
public class Test14 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    int arr1[] = new int[26];
    for(int i =0;i<str1.length();i++){
     int x= arr1[str1.charAt(i) - 'a']++;
     System.out.println(x);
  }
  
  }
}
