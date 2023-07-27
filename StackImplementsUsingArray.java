
public class StackImplementsUsingArray {
  int top;
  int size;
  int arr[];
  public static void main(String[]args){
    StackImplementsUsingArray st = new StackImplementsUsingArray();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.display();
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.isEmpty());

  }
  StackImplementsUsingArray(){
    top = -1;
    size = 5;
    arr = new int [size];
  }
  public boolean isFull(){
    return top==size-1;
  }
  public boolean isEmpty(){
    return top == -1;
  }
  public int push(int data){
    if(isFull()){
      System.out.println("overflow");
    }
    return arr[++top] = data;
  }
  public int pop(){
    if(isEmpty()){
      System.out.println("Underflow");
    }
    return arr[top--];
  }
  public int peek(){
    return arr[top];
  }
  public void display(){
    for(int i : arr){
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
