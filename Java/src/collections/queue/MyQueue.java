package collections.queue;

class Node<E> {
  E data;
  Node<E> next;

  public Node(E data) {
    this.data = data;
    next = null;
  }
}

public class MyQueue<T> {
  private Node<T> head, rear;

  public void enqueue(T val) {
    Node<T> toAdd = new Node<>(val);

    if (head == null) {
      head = rear = toAdd;
      return;
    }

    rear.next = toAdd;
    rear = rear.next;
  }

  public T dequeue() {
    if (head == null) return null;

    Node<T> temp = head;
    head = head.next;

    if (head == null) rear = null;
    return temp.data;
  }

}
