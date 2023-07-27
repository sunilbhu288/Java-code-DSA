public class SortedString2 {
  public static void main(String []args){

     char ch [] = {'R','W','B','B','R','W','W','B'};
     solution(ch);

  }
  public static void solution(char ch[]){
    for(int i=0;i<ch.length;i++){
      if(ch[i]=='W'){
        System.out.print(ch[i]+" ");
      }
    }
    for(int i=0;i<ch.length;i++){
      if(ch[i]=='B'){
        System.out.print(ch[i]+" ");
      }
    }
    for(int i=0;i<ch.length;i++){
      if(ch[i]=='R'){
        System.out.print(ch[i]+" ");
      }
    }
  }
}
