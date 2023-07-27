public class QueueImplementDemo {
  int arr[];
  int front;
  int rear;
  int size;
  public static void main(String []args){
    QueueImplementDemo qq = new QueueImplementDemo ();
    qq.add(1);
    qq.add(2);
    qq.add(3);
    qq.add(4);
    qq.add(5);
    qq.display();
    System.out.println(qq.top());
    System.out.println(qq.poll());

  }
  QueueImplementDemo (){
     size = 5;
     front = -1;
     rear = -1;
     arr = new int[size];
  }
  public int add(int data){
    
    return arr[++rear] = data;
  }
  public boolean isEmpty(){
    if(rear<=front){
      return true;
    }
    return false;
  }
  public int poll(){
    if( isEmpty()){
      System.out.println("empty");
      System.exit(-1);
    }
    if(rear>=front){
      return arr[++front];
    }
    return (Integer)null;
  }
  public void display(){
    for(int i : arr){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public int top(){
    return arr[rear];
  }
}
