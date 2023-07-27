import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Even numbers");
        for(int i= 0;i<=n;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for(int i=1;i<=n;i=i+2){
            System.out.print(i+" ");
        }
    }
}
