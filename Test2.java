import java.util.Scanner;
public class Test2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    
    int arr[] = new int[size];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int findValue = sc.nextInt();
    boolean value = false;
    for(int i=0;i<arr.length;i++){
      if(arr[i] == findValue){
        System.out.println("Index is: "+i);
        value = true;
      }
    }
    if(!value){
      System.out.println("not find the value");
    }
  }
}
