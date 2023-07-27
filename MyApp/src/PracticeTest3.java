import java.util.Scanner;
public class PracticeTest3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int p = sc.nextInt();
        int res = somOfTwoNumber(k,p);
        System.out.println(res);
    }


    public static int somOfTwoNumber(int a, int b){ 
       int sum = a+b;
       return sum;
    }
}
