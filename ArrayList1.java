import java.util.*;
public class ArrayList1 {
  public static void main(String []args){
     ArrayList a = new ArrayList();
     a.add(1);
     a.add("sunil");
     a.add(1.2);
     a.add('c');
     System.out.println(a);

     ArrayList b = new ArrayList(a);
     b.add(10);
     b.add("end");
     System.out.println(b);
     b.remove(2);
     System.out.println(b);
     //b.get(3);
     System.out.println(b.get(3));
  }
}
