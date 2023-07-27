public class Test67 {
  public static void main(String []args){
    int arr[] = {2,4,3,7,6,5,8,9,0};
  }
  public static void conquir(int arr[], int l, int m, int h){
    int n1 = m-l+1;
    int n2 = h-m;
    
    int left[] = new int[n1];
    int right[] = new int[n2];
    for(int i=0;i<n1;i++){
      arr[i] = left[l+i];
    }
    for(int i=0;i<n2;i++){
      arr[i] = right[m+1+i];
    }
    int i=0;
    int j =0;
    int k =l;
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
    while(i<n1){
      
    }
  }
}
