public class QueueImplementUsingLinkedList {
  int arr[];
  int size;
  int top;

  public static void main(String[] args) {
    // QueueImplementUsingLinkedList st = new QueueImplementUsingLinkedList();

  }

  QueueImplementUsingLinkedList(int n) {
    size = n;
    arr = new int[size];
    top = -1;
  }

  public void push(int n) {
    if (top == size - 1) {
      System.out.println("Overflow");
      return;
    } else {
      top = top + 1;
      arr[top] = n;
    }
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Underflow");
      return -1;
    } else {
      int val = arr[top];
      top = top - 1;
      return val;
    }

  }

  public void display() {
    if (top == -1) {
      System.out.println("stack is empty");
    } else {
      for (int i = top; i >= 0; i--) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
