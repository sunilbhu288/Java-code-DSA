import java.util.Scanner;
public class Test6 {
    public static void main(String [] args){
        int count =0;
        int i;
        String prime = "";
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for( i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            prime =prime +  i + " ";
        }
        System.out.println(prime);
    }
}
