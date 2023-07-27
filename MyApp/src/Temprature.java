import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        int T = (F - 32) * 5;
        int k = T/9;
        System.out.println(k);
        System.out.println("Sunil"+" "+"Patel");
    }
}
