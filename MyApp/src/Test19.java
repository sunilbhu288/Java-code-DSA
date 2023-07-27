import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number;
        if (n > 0) {
            number = 1;
        } else if (n < 0) {
            number = 2;
        } else {
            number = 3;
        }
        switch (number) {
            case 1:
                System.out.println("Positive");
                break;
            case 2:
                System.out.println("Negative");
                break;
            case 3:
                System.out.println("Zero");
                break;
                default: System.out.println("Invalid Number");
        }
    }

}
