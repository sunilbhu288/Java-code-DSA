import java.util.Scanner;
public class superPrime {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int count =0;
    for(int i=2;i<=k;i++){
    if(isPrimeNumber(i)){
        count++;
    }
    if(isPrimeNumber(count)){
        System.out.println(i+" ");
    }
   }
}
   public static boolean isPrimeNumber(int n){
    int i;
    for( i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
         if(i==1 && i==2)
           return false;
         else
        return true;
    
   }
}
