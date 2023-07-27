public class StackProblems2 {
  int arr[];
  int size;
  int top;
  StackProblems2(){
    
    top = -1;
    size = 5;
    arr = new int[size];
  }

   public boolean isFull(){
     return top == size-1;
   }
   public int push(int data){
    if(isFull()){
      System.out.println("overflowing");
    }
    return arr[++top] = data;

   }
   public boolean isEmpty(){
    return top == -1;

   }
   public int pop(){
    if(isEmpty()){
      System.out.println("underflowing");
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
   }
   public static void main(String []args){
    StackProblems2 st = new StackProblems2();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
     while(!st.isEmpty()){
      System.out.print(st.pop()+" ");
      // st.pop();
    }
   // st.display();
   }

}
