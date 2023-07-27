import java.util.Scanner;

public class LoopDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        do{
            System.out.print(n+" ");
            n++;
        
        if(n==5){
            break;
            
        }
        }
            while(n<=num);
    
        }
    }

