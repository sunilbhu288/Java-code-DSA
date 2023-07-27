import java.util.Scanner;
import java.util.*;
public class OnlyTest41 {
  public static void main (String[] args) {
    // Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
} 
int k = sc.nextInt();
int maxSum = 0;
for(int i=0;i<k;i++){
maxSum+=arr[i];
}  
int sum = maxSum;
for(int i=k;i<n;i++){
sum += (arr[i]-arr[i-k]);
maxSum = Math.max(sum,maxSum);
}
System.out.print(maxSum);
}
}

