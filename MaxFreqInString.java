public class MaxFreqInString {
  public static void main(String []args){
    String str = "abbbbcccadedec";
    char ch[] = str.toCharArray();
    int maxCount = 0;
    char element = 0;
    for(int i=0;i<ch.length;i++){
      int count = 1;
      for(int j=i+1;j<ch.length;j++){
        if(ch[i]==ch[j]){
          count++;
        }
      }
      if(maxCount<count){
        maxCount = count;
        element = ch[i];
      }
    } 
    System.out.println(element+ " " + maxCount);
  }
}
