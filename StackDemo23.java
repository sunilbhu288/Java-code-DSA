import java.util.*;
public class StackDemo23 {
  int arr[];
  int size;
  int front;
  public static void main(String []args){
    StackDemo23 st = new StackDemo23();
    st.push(6);
    st.push(8);
    st.push(7);
    st.push(4);
    st.push(5);
    st.display();
    System.out.println(st.peek());
  }
  StackDemo23(){
    size = 5;
    arr = new int[size];
    front = -1;
  }
  public boolean isFull(){
    if(front == size-1){
      return true;
    }
    return false;
  }
  public int push(int data){
    if(isFull()){
      System.out.println("stack is full");
      System.exit(0);
    }
    return arr[++front] = data;
  }
  public boolean isEmpty(){
      if(front == -1){
        return true;
      }
       return false;
    }
    public int pop(){
      if(isEmpty()){
          System.out.println("stack is empty");
          System.exit(-1);
      }
      return arr[front--];
    }
    public int peek(){
      return arr[front];
    }
    public void display(){
      for(int i = 0 ;i< arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
    
  }


