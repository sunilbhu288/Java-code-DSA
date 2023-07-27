public class TwoStackImplementationUsingArray {
  int arr[];
  int size;
  int top1;
  int top2;
  public static void main(String args []){
      
  }
  TwoStackImplementationUsingArray(){
    size = 5;
    arr =  new int[size];
    top1 = -1;
    top2 = size;
  }
  public boolean isFull(){
    if(top1 > top2){
      return true;
    }
    return false;
  }
  public int push1(int data){
    if(isFull()){
      System.out.println("stack overflowing");
    }
    return arr[++top1] = data;
  }
  public int push2(int data){
    if(isFull()){
      System.out.println("stack overflow");
    }
    return arr[--top2] = data;
  }
  
  
  public int pop1(){
     if(top1>=0){
      int x = arr[top1--];
     
     return x;
  }
  else{
    System.out.println("stack is empty");
  }
  }
  public int pop2(){
    if(top2<size){
      int x = arr[top2++];
      return x;
    }
    else{
      System.out.println("stack is empty");
    }
  }
}