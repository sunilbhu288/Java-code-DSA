import java.util.Scanner;
public class BinarySearching {
  public static void main(String [] args){
    int arr [] = {1,2,4,6,8,9,10};
    int foundNumber = 1;
    int l = 0;
    int h = arr.length-1;
    
   while(l<=h){
    int mid = l + (h-l)/2;
    if(arr[mid] == foundNumber){
      System.out.println("Index is :"+mid);
      break;
  

    }
    if(mid>foundNumber){
      h = mid - 1;
    }
    else {
      l = mid + 1;
    }
  }
    System.out.println("new value of l is " +l+ " and h is " +h);
  }
}
