import java.util.Scanner;
public class PrimeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int i,count,j;
      for(i=1;i<=n;i++){
        count =0;
        for(j=1;j<=i;j++){
            if(i%j==0){
            count++;
        }
    
    }
        if(count==2){
            System.out.print(i+" ");
      
    }
}
}
}
