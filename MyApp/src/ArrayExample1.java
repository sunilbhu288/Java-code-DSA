import java.util.Scanner;
public class ArrayExample1 {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int positive=0;
    int negative=0;
    int zero=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            positive++;
        }
        else if(arr[i]<5 )
        
        {
            negative++;
        }
       else  if(arr[i]==0){
            zero++;
        }
    }
    System.out.println("positive "+positive);
    System.out.println("negative "+negative);
    System.out.println("zero "+zero);

}
}
