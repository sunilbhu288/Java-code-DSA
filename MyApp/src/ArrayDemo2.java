import java.util.Scanner;
public class ArrayDemo2 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int [size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int count =0;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size-1;j++){
            if(arr[i]+arr[j]==7){
              count++;
            }
            
            
        }
    }

    System.out.println("total number"+count);
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size-1;j++){
            if((arr[i]+arr[j])!=7){

            }
        }
    }
    System.out.println("Not found");
    
   } 
}
