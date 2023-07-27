public class DemoAraay1 {
  public static void main(String args[]){
    int arr1[] = {1,2,3,4,4,5,6};
    for(int i=0;i<arr1.length;i++){
      if(arr1[i]==4){
        i=i+1;
      }
      System.out.print(arr1[i]+" ");
    }
  }
}
