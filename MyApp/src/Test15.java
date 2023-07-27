import java.util.Scanner;
public class Test15 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = a = b;
        for(k=1;k<=8;k++){
            if(a>b){
                System.out.println("A");
                break;
            }
            else{
                System.out.println("B");
                break;
            }
        }
    }
}
