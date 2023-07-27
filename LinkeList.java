public class LinkeList {
  Node head;
  public static void main(String []args){
    LinkeList list = new LinkeList();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    //list.addFirst(6);
    list.printList();
    list.deleteMid();
    list.printList();
    list.addElementInMid(10);
    list.printList();
}
public class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
    }
    else{
        newNode.next = head;
        head = newNode;
    }
}
public int countSize(Node head){
    int count =0;
    if(head==null){
        return 0;
    }
    else{
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
  }
    public void deleteMid(){
        int size = countSize(head);
        int mid = size/2;
         Node temp = head;
        while(mid>1){
           temp = temp.next;
            mid--;
        }
        temp.next = temp.next.next;
    }
    public void addElementInMid(int data){
      Node newNode = new Node(data);
      Node temp = head;
      int size = countSize(head);
      int mid = size/2;
      while(mid>1){
        temp = temp.next;
        mid--;
      }
      newNode.next = temp.next;
      temp.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}


