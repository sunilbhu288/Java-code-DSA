import java.util.*;
public class ArrayList5 {
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
     System.out.println(list.get(3));
     System.out.println(list.set(2,1000));
     System.out.println(list);
     list.remove(3);
     for(int r : list){
      System.out.println(r);
     }
  }
}
