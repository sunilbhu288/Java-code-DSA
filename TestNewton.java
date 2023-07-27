import java.util.Scanner;
public class TestNewton {
  public static void main (String[] args) {
    // Your code here
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t>0){
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<arr.length;i++){
arr[i] = sc.nextInt();
}
if(findPivot(arr)){
System.out.println("Yes");
}
else{
System.out.println("No");
}
t--;
}              
}
public static boolean findPivot(int [] arr){
int low = 0;
int high = arr.length-1;
while(low<high){
int mid = (low+high)/2;
if(arr[mid]<arr[high]){
high = mid;
}
else {
low = mid - 1;
}
}
return true;
}
}


