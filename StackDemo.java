public class StackDemo {
  int arr[];
  int size;
  int top;
  
  StackDemo(){
      size = 5;
      top = -1;
      arr = new int[size];
  }
  public boolean isFull(){
      if(top == size-1){
          return true;
      }
      return false;
  }
  public int push(int data){
      if(isFull()){
          System.out.println("Overflow");
      }
      
          return arr[++top]=data;
    
  }
  public boolean isEmpty(){
      if(top==-1){
          return true;
      }
      return false;
  }
  public int pop(){
      if(isEmpty()){
          System.out.println("Underflow");
      }
      
          return arr[top--];
      
  }
  public int top(){
      return arr[top];
  }
  public void display(){
      for(int i : arr){
          System.out.print(i+" ");
      }
  }
  public void main(String arg[]){
      StackDemo st = new StackDemo();
          st.push(1);
          st.push(2);
          st.push(3);
          st.push(4);
          st.push(5);
          st.display();
      
  }
}

