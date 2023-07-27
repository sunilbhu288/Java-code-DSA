import java.util.Scanner;
public class PracticeTest {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str []= new String [5];
    for(int i=1;i<5;i++){
        //se
      //  int x = sc.nextInt();
         str[i] = sc.next();
    }
      for(int i=1;i<5;i++){
        System.out.print(i+" ");
        System.out.print(str[i]);
        System.out.println();
      }
        
    }
    

   } 

