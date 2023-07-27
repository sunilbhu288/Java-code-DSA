public class WindowSlide {
  public static void main(String []args){
    int arr[] = {2,3,4,1, 5,6,8,7,6,9};
    int k = 4;
    for(int i=0;i<=arr.length-k;i++){

      int max = arr[i];

       for(int j=1;j<k;j++){

          if(arr[i+j]>max){

             max = arr[i+j];
          }
        }
          System.out.print(max+" ");
       
    }
  }
}
