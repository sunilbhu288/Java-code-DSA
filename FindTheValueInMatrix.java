import java.util.Scanner;
public class FindTheValueInMatrix {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int coloum = sc.nextInt();
    int arr[][] = new int [row][coloum];
    for(int i=0;i<row;i++){
      for(int j=0;j<coloum;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    boolean value = false;
    int temp = sc.nextInt();
    for(int i=0;i<row;i++){
      for(int j=0;j<coloum;j++){
       if(arr[i][j]==temp){
        System.out.println(i+","+j);
        value = true;
        
       }
      }
    }
       if(!value==false){
        System.out.println("value is not find");
       
      
    }
  }
}
