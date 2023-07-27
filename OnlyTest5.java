import java.util.Scanner;
public class OnlyTest5 {
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
 int size3 = arr1.length + arr2.length;
 int arr3 [] = new int[size3];
   for(int i=0;i<arr1.length;i++){
    arr3[i] = arr1[i];
   }
   for(int i=0;i<arr2.length;i++){
    arr3[arr1.length+i] = arr2[i];
   }
   System.out.println("addition of arrays ");
   for(int i=0;i<size3;i++){
    System.out.print(arr3[i]+" ");
    System.out.println();
   }
   int temp;
   System.out.println("Assending order arrays");
   for(int i=0;i<size3;i++){
    for(int j=i+1;j<size3;j++){
      if(arr3[i]>arr3[j]){
        temp = arr3[i];
        arr3[i] = arr3[j];
        arr3[j] = temp;
      }
    }
     
   }
   for(int i=0;i<size3;i++){
    System.out.print(arr3[i]+" ");
   }
}
}
