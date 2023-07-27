import java.util.*;

public class DequeDemo1 {
  public static void main(String []args){
    Deque<Integer> q = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q);
    //System.out.println();
    q.push(1);
    q.push(2);
    q.push(3);
    System.out.println(q);
  }
}
