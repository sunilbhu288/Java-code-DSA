import java.util.*;
class stackPractice2{
    int top;
    int size;
    int arr[];
    
   public stackPractice2(){
        top = -1;
        size = 5;
        arr = new int[size];
    }
    public static void main(String args[]){
        stackPractice2 st = new stackPractice2();
            st.push(1);
             st.push(2);
              st.push(3);
               st.push(4);
                st.push(5);
                st.display();
        }
    
    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(top ==-1){
            return true;
        }
        return false;
    }
    public int push(int data){
        if(isFull()){
            System.out.println("overflow");
            //return 1000;
        }
        return arr[++top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("underflow");
          //  return -1;
        }
        return arr[top--];
    }
    public void display(){
        for(int r : arr){
            System.out.print(r+" ");
        }
        System.out.println();
    }
}
