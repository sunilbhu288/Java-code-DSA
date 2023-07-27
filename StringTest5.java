public class StringTest5 {
  public static void main(String []args){
    String str = "RadaR";
    String reverseStr = "";
    for(int i=str.length()-1;i>=0;i--){
      reverseStr = reverseStr + str.charAt(i);
    }
    //if(str.toLowerCase().equals(reverseStr.toLowerCase())){
      if(str.equals(reverseStr)){
      System.out.println("palindrome");
    }
    else{
      System.out.println("not palindrome");
    }
    
  }
}
