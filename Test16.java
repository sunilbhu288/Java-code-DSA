import java.util.Scanner;
public class Test16 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size1 = sc.nextInt();
    int arr1[] = new int[size1];
    for(int i=0;i<size1;i++){
  arr1[i] = sc.nextInt();
    }
    int size2 = sc.nextInt();
    int arr2[] = new int[size2];
    for(int i=0;i<size2;i++){
      arr2[i] = sc.nextInt();
    }
    System.out.println("first array");
    for(int i=0;i<size1;i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println();
    System.out.println("second array");
    for(int i=0;i<size2;i++){
      System.out.print(arr2[i]+" ");
    }
    System.out.println();
    System.out.println("elements of c arrays");
    int c1 = arr1.length+arr2.length;
    int c[] = new int[c1];
    for(int i=0;i<arr1.length;i++){
      c[i] = arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
      c[arr1.length+i]=arr2[i];
    }
    for(int i=0;i<c1;i++){
      System.out.print(c[i]+" ");
    }

  }
}