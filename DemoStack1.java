import java.util.*;
public class DemoStack1 {
   static Node root;
   public static class Node{
     int data;
     ArrayList<Node>children = new ArrayList<>();
   }
   public static void display(Node node){
     String str = node.data +"-->";
      for(Node child :node.children){
         str = str + child.data+" ";
      }
      System.out.println(str);
      for(Node child : node.children){
         display(child);
      }
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
     }
     Stack<Node> st = new Stack<>();
     for(int i=0;i<n;i++){
      if(arr[i]==-1){
        st.pop();
      }
      else{
        Node t = new Node();
         t.data = arr[i];
         if(st.size()>0){
           st.peek().children.add(t);
         }
         else{
           root = t;
         }
         st.push(t);
      }
     }
      display(root);
   }
  
}
