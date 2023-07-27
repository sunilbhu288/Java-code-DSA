public class QueueDemo1 {
  int rear;
  int front;
  int size;
  int arr[];
  QueueDemo1(){
    rear = -1;
    front = -1;
    size = 5;
    arr = new int[size];
  }
  public boolean isEmpty(){
    if(rear<=front){
      return true;
    }
    return false;
  }
  public int offer(int data){
    return arr[++rear] = data;
  }
  public int poll(){
    if(isEmpty()){
      System.out.println("Queue is empty");
    }
    return arr[front++];
  }
  public int peek(){
    return arr[rear];
  }
  public void display(){
    for(int i : arr){
      System.out.print(i+" ");
    }
  }
  public void main(String []args){
    QueueDemo1 qq = new QueueDemo1();
    qq.offer(1);
    qq.offer(2);
    qq.offer(3);
    qq.offer(4);
    qq.offer(5);
    qq.offer(6);
    qq.display();
  }

}
