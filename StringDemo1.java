import java.util.Scanner;
public class StringDemo1 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
   int row = sc.nextInt();
   int colums = sc.nextInt();
   int arr[][] = new int[row][colums];
   for(int i=0;i<row;i++){
    for(int j=0;j<colums;j++){
      arr[i][j] = sc.nextInt();
    }
   }
   int valueOfOnes = 0;
   int indexOfMaxOnes = -1;
   for(int i=0;i<row;i++){
    int ones = 0;
    for(int j=0;j<colums;j++){
      if(arr[i][j]==1){
        ones++;
      }
    }
    if(valueOfOnes<ones){
      indexOfMaxOnes = i;
      valueOfOnes = ones;
    }
   }
   System.out.println(indexOfMaxOnes);
  }
}
