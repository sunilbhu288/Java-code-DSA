public class Test780 {
  public static void main(String []args){
    int arr[] = {1,2,3,4,5};
    int k =3;
    int i=0;
    int j = k-1;
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      
      i++;
      j--;
    }
    for(int p = 0;p<arr.length;p++){

    
    System.out.print(arr[p]+" ");

  }
}
}
