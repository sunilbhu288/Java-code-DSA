public class Test63 {
  public static void main(String []args){
    int arr[] = {2,3,5,6,7,8,9,10,13,23};
    int number = 9;
    int l = 0;
    int h = arr.length-1;
     while(l<=h){
        int m = l+(h-l)/2;
        if(arr[m]== number){
          System.out.println(m);
          break;
        }
        if(arr[m]>number){
          h = m-1;
        }
        else{
          l = m+1;
        }

        }
     }
  }
 

