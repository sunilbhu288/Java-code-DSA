import java.util.*;
public class StringPrefixDemo {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr[] = new String[n];
    for(int i=1;i<n;i++){
        arr[i] = sc.next();
    }
     findlargestPrefix(arr,n);

}
public static void findlargestPrefix(String arr[] ,int n){
    String first = arr[0];
    for(int i=1;i<n;i++){
        String current = arr[i];
        int j=0;
        while(j<first.length() && j< current.length() && first.charAt(j)==current.charAt(j)){
            j++;
        }
        if(j==0){
            System.out.println("No string found");
        }
        else{
            first = current.substring(0,j);
        }
    }
    System.out.println(first);
}
}

