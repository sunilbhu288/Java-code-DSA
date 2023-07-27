public class QueuePractice1 {
  int front;
  int rear;
  int size;
  int arr[];

  QueuePractice1(){
    front = -1;
    rear = -1;
    size = 5;
    arr = new int[size];
  }
  public static void main(String args[]){
    QueuePractice1 qq = new QueuePractice1 ();
      qq.add(1);
      qq.add(2);
      qq.add(3);
      qq.add(4);
      qq.add(5);
      qq.display();
      System.out.println(qq.poll());
  }
  public boolean isFull(){
     return front >rear;
  }
  public boolean isEmpty(){
    return front==-1;
  }
  public int add(int data){
     if(isFull()){
      System.out.println("Overflow");
     }
     return arr[++rear]=data;
  }
  public int poll(){
    if(isEmpty()){
      System.out.println("underflow");
    }
    return arr[++front];
  }
  public void display(){
    for(int r : arr){
      System.out.print(r+" ");
    }
    System.out.println();
  }
}
