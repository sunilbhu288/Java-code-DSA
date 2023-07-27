public class Test21 {
  public static void main(String []args){
    int arr1[] = {2,4,5,6,7,8,1};
    int arr2[] = {3,9,5,2,6};
    int n1 = arr1.length;
    int n2 = arr2.length;

    int i=0;
    int j=0;
    
    while(i<n1 && j<n2){
      if(arr1[i]==arr2[j]){
        System.out.print(arr1[i]);
        i++;
        j++;
      }
      else if(arr1[i]>arr2[j]){
         j++;
      }
      else{
        i++;
      }
    }

  }
}
