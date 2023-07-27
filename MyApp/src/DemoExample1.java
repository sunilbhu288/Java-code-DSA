import java.util.Scanner;
public class DemoExample1 {
    public static void main(String [] args){
        System.out.println("Enter the size of arrays");
        Scanner sc = new Scanner(System.in);
       
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter the input for arrays");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("output of arrays");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");

        }
        // find the maximum of arrays
        int max_arrays = arr[0];
        for(int i=0;i<size;i++){
        if(max_arrays < arr[i]){
            max_arrays=arr[i];
        }

    }
    System.out.println();
    System.out.println("Maximum arrays " + max_arrays);
    //suppose when we find the increamnt 
    int min_arrays = arr[0];
    for(int i=0;i<size;i++){
        if(min_arrays > arr[i]){
            min_arrays = arr[i];
        }
    }
    System.out.println();
    System.out.println("minimum arrays : " + min_arrays);
    for(int i=size-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Even number");
    for(int i=0;i<size;i++){
        if(arr[i]%2==0){
            System.out.print(arr[i]+ " ");
        }
    }
        System.out.println();
        System.out.println("odd numbers");
        for(int i=0;i<size;i++){
        if(arr[i]%2!=0){
      System.out.print(arr[i]+ " ");
        
    }
}

}
}
