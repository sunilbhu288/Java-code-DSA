public class Test22 {
  public static void main(String []args){
    int arr1[] = {1,2,3,4,5,7};
    int arr2[] = {11,12,13,14};
    int arr3[] = {5,6,7,8,9,10};
    findCommanElement(arr1, arr2,arr3);

  }
  public static void findCommanElement(int arr1[], int arr2[], int arr3[]){

       int i=0;
       int j=0;
       int k=0;
       while(i<arr1.length && j<arr2.length && k<arr3.length){
       if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
        System.out.println(arr1[i]);
        i++;
        j++;
        k++;
       }
       else if(arr1[i]>arr2[j]){
        j++;
       }
       else if(arr2[j]>arr3[k]){
        k++;
       }
       else if(arr3[k]>arr1[i]){
        i++;
       }
       else{
        System.out.println("No any comman element");
       }
      }
  }
}
