import java.util.Scanner;
public class PracticeFunction3 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int result = getSum(p,q);
    System.out.println("Addition of two numbers " +result);


    getMul(p,q);

    }
    static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    static void getMul(int x, int y){
        int mul = x*y;
        if(mul%2==0){
        System.out.println("Multiple result is even value");
        return;
        }
        System.out.println("multiple result of two number is odd");
        //System.out.println("Multiple of two number :"+mul);
        return;
       // System.out.println("End line");
    }
}
