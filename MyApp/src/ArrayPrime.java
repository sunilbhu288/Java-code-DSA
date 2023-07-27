package MyApp.src;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayPrime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int count=0;
         int i;
        //  for(i=1;i<=n;i++){
        //   if(n%i==0){
        //     count++;
        //   }
        //  }
        //  if(count==2){
        //     System.out.println(n);
        //  }
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n);
            n--;
        }
        
    }
}
