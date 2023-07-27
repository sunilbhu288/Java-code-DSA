import java.util.*;
public class Oops5 {
  public static void main(String []args){
  LinkedList<String>list = new LinkedList<String>();
   list.addFirst("a");
   list.addFirst("b");
   list.addFirst("c");
   list.addLast("d");
   System.out.println(list);
   System.out.println(list.size());
   for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" -> ");
   }
   System.out.print(list.remove(2));
   System.out.println("null");
   
  }
}
