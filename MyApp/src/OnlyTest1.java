import java.util.Scanner;
public class OnlyTest1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int k = a*i;
        System.out.println(Math.pow(k,2));
        }
    }
}
