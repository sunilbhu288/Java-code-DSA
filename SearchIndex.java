import java.util.Scanner;
public class SearchIndex {
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int index = 9;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    boolean numberfound = false;
    for(int i=0;i<arr.length;i++){
      if(arr[i] == index){
        System.out.println("array index is:"+i);
        numberfound = true;
      }
    }
    if(!numberfound){
      System.out.println("Number is not found");
    }
  }
  
}
