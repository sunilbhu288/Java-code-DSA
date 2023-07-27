import java.util.Scanner;
public class StringDemo3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()*2;
        //int k = 2*n;
        String str = sc.nextLine();
        String str1 = "";
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
          str1 = str1 + ch[i];
        }
        System.out.println(n);
       System.out.println(str1);
    }
}
  

