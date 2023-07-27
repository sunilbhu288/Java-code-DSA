import java.util.Scanner;
public class TestDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        // int b = sc.nextInt();
        int big =0;
        int small =0;
         for(int i=0;i<=a;i++){
          big = Math.max(0,i);
          small = Math.min(0,i);
         }
         System.out.println(big);
         System.out.println(small);
    }
}
