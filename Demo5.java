public class Demo5 {
  public static void main(String []args){
    int left[] = {2,3,4,1,6,5,7,2};
    int n1 = left.length;
    int right[] = {4,3,5,2,1,7,6,};
    int n2 = right.length;
    
  int i =0;
  int j=0;
  int k = 0;
   int arr[] = new int[n1+n2];

  while(i<n1 && j<n2){
    if(left[i]<=right[j]){
      arr[k] = left[i];
      i++;
    }
    else{
      arr[k] = right[j];
      j++;
    }
    k++;
  }
  for(int p = 0;p<arr.length;p++){
    System.out.print(arr[p]+" ");
  }
  }
  }
 /* while(i<n1){
    arr[k] = left[i];
    k++;
    i++;
  }
  while(j<arr[j]){
    arr[k] = right[j];
    k++;
    j++;
  }
  // for(int p=0;p<n1+n2;p++){
  //   System.out.print(arr[p]+" ");
  // }
  }*/ 
  
  

