import java.util.*;
public class swapLinkedList {
  Node head;
    public static void main(String args[]){
       swapLinkedList list = new swapLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
    }
    class Node{
        int data;
        Node next;
        
            Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" -->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public Node swpNode(Node head, int k){
        Node fast = head;
        while(k>1){
            fast = fast.next;
            k--;
        }
        Node p = fast;
        Node slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node q = slow;
        int temp = p.data;
        p.data = q.data;
        q.data = temp;
        return head;
    }
}

