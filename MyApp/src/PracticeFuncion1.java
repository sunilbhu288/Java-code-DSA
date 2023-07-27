import java.util.Scanner;
public class PracticeFuncion1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = sumOfNumber(x,y);
        System.out.println("Sum of two number");
        System.out.println(result);
        System.out.println("Multiple of two number");
        int result2 = mulipleOfTwo(x,y);
        System.out.println(result2);

    }
    static int sumOfNumber(int a,int b){
        int sum = a+b;
      
        return sum;
        
        
    }
    static int mulipleOfTwo(int p,int k){
        System.out.println("This is the end of the block");
        int mul = p*k;
        
        return mul;
    }
}

