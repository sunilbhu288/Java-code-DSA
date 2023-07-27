public class StringDemo6 {
  public static void main(String []arsg){
    String str = "???abcsd?av";
    String ans = printString(str);
    System.out.println(ans);
}
public static String printString(String str){
    char ch[] = str.toCharArray();
    String fs = "";
    for(int i=0;i<str.length();i++){
        if(ch[i]!='?'){
            fs = fs + ch[i];
        }
    }
   return fs;
  }
}
