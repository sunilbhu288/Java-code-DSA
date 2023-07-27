public class QueueImlementUsingArray {
  int rear;
  int front;
  int size;
  int arr[];
  public static void main(String []args){
    QueueImlementUsingArray qq = new QueueImlementUsingArray();
    qq.enque(1);
    qq.enque(2);
    qq.enque(3);
    qq.enque(4);
    qq.enque(5);
    qq.display();
    System.out.println(qq.deque());
    }

  
  QueueImlementUsingArray(){
    rear = -1;
    front = -1;
    size = 5;
    arr = new int[size];
  }
  public boolean isEmpty(){
    return rear<=front;
  }
  public int enque(int data){

    return arr[++rear] = data;
  }
  public int deque(){
    if(isEmpty()){
      System.out.println("queue is empty");
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
}
