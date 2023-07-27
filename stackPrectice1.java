  class stackPractice1 {
  int size ;
  int top;
  int arr[];

  stackPractice1(){
    size = 5;
    top =-1;
    arr = new int[size];
  }

  
  public static void main(String args[]){
   stackPractice1 st = new stackPractice1();
   st.push(1);
   st.push(2);
   st.push(3);
   st.push(4);
   st.display();
      
  }
  public boolean isFull(){
        return top == size-1;
  }
  public boolean isEmpty(){
    return top == -1;
  }
  public int push(int data){
    if(isFull()){
      System.out.println("overflow");
    }
    return  arr[++top] = data;
  }
   public int pop(){
    if(isEmpty()){
      System.out.println("underflow");
    }
     return arr[top--];
   }
   public void display(){
    for(int i : arr){
      System.out.print(i+" ");
    }
   }

}
