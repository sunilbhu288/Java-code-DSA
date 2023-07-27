public class StringTest4 {
  public static void main(String []args){
    String str = "hello";
    char ch [] = str.toCharArray();
    int i=0;
    int j=ch.length-1;
    while(i<j){
      char temp = ch[i];
      ch[i] = ch[j];
      ch[j] = temp;
      i++;
      j--;
    }
    for(int k = 0;k<ch.length;k++){
      System.out.print(ch[k]+" ");
    }
  }
}
