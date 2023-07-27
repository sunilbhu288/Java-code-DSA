import java.util.Scanner;
import java.util.Arrays;
public class ArraysDemo1 {
  public static void main (String[] args) {
    // Your code here
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t>0){
int n = sc.nextInt();
int arr[] = new int [n];
for(int i=0;i<arr.length;i++){
arr[i] = sc.nextInt();
}
t--;
}
Arrays.sort(arr);
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}

}
}
}
