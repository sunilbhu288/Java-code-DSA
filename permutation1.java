import java.util.*;
public class permutation1 {
  public static void main(String []args){
      //----------------
      int array[] = {1,2,3};
  }
      function nextPermutation(array) {
        var i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
    
        if (i <= 0) {
            return false;
        }
    
        var j = array.length - 1;
    
        while (array[j] <= array[i - 1]) {
            j--;
        }
    
        var temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;
    
        j = array.length - 1;
    
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    
        return array;
    }
  }

