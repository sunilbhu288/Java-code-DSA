import java.util.Scanner;
public class Test1 {
  //get the value 
  // set the value
  // delete the value
  //find the value
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  int number = sc.nextInt();
  int position = sc.nextInt();
  int maskbit = 1<<position;
  int result = number & maskbit;
  System.out.println("Get manipulation "+result);

  System.out.println();
  System.out.println("Set Manipulation");
  int result2 = number | maskbit;
  System.out.println("Set Manipulation "+result2);
  System.out.println();
  System.out.println("For delete manipulation");
  int maskbit2 = ~maskbit;
  int result3 = number&maskbit2;
  System.out.println("DeleteNumber "+result3);
  }
}
