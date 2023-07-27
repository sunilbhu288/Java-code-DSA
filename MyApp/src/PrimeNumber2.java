import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int count;
        int i;
        int j;
        for ( i = 1; i <= n; i++) {
           int count = 0;
            for ( j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        
            if (count == 2) {
                System.out.print(i + " ");
            } 
        }
    }
}
