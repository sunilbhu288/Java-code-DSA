import java.util.Scanner;
public class StringTest2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int sumDigit = 0;
    char [] arr = str.toCharArray();
    for(int i=0;i<arr.length;i++){
      char digit = arr[i];
      sumDigit = sumDigit + (digit-'0');
    }
    System.out.println(sumDigit);
  }
}
