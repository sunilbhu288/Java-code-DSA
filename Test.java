import java.util.Scanner;
public class Test {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int coloum = sc.nextInt();
    int [][]arr = new int[row][coloum];
    for(int i=0;i<row;i++){
      for(int j=0;j<coloum;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int index = -1;
    int onesNumber=0 ;
    for(int i=0;i<row;i++){
      int count =0;
      for(int j=0;j<coloum;j++){
        //arr[i][j] = sc.nextInt();
        if(arr[i][j]==1){
          count++;
        }
      }
      if(onesNumber<count){
        index = i;
        onesNumber = count;
        
      }
    }
    System.out.println(index);
  }
   
}
