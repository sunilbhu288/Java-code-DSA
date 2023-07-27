import java.util.Scanner;
public class OnlyTest19 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "";
    while(n>0){
     int value = n%10;
     if(value==0){
      ans = ans + " zero";
     }
     else if(value == 1){
      ans = ans + " one";
     }
     else if(value == 2){
      ans = ans + " two";
     }
     else if(value == 3){
      ans = ans + " three";
     }
     else if(value == 4){
      ans = ans + " four";
     }
     else if(value == 5){
      ans = ans + " five";
     }
     else if(value == 6){
      ans = ans + " six";
     }
     else if(value == 7){
      ans = ans + " two";
     }
     else if(value == 8){
      ans = ans + " eight";
     }
     else if(value ==9){
      ans = ans + " nine";
     }
     n = n/10;
     
  }
  System.out.println(ans);
}
  
}
