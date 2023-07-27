import java.util.Scanner;
public class LoopDemo1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int product = i*n;
            if(i==6){
                continue;
            }
            System.out.println(i+" x "+n+" = "+product);
            
        }
    }
}
