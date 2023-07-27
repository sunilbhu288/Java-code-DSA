import java.util.Scanner;
public class Swap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping number "+a+","+b);
        int temp =a +b;
        a=temp-a;
        b=temp-b;
        System.out.println("After swapping number "+a+","+b);
    }  
}
