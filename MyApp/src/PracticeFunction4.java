import java.util.Scanner;
public class PracticeFunction4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       multiple(a,b);
    

    }
    static void multiple(int x,int n){
        for(int i=1;i<=n;i++){
            int table = x*i;
            System.out.println(i + " x " + x + " = "+ table);
           //return table;
        }
    }
}
