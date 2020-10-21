package collections.deque;

public class MyDeque<T> {
  Node<T> head, tail;

  public static class Node<T> {
    T data;
    Node<T> next, prev;

    public Node(T data) {
      this.data = data;
      this.next = this.prev = null;
    }
  }

  public void addToHead(T data) {
    Node<T> toAdd = new Node<>(data);

    if (head == null) {
      head = tail = toAdd;
      return;
    }

    head.next = toAdd;
    toAdd.prev = head;
    head = toAdd;
  }

  public T removeLast() {
    if (head == null) {
      return null;
    }

    Node<T> toRemove = tail;
    tail = tail.next;
    tail.prev = null;

    if (tail == null) 
      head = null;

    return toRemove.data;
  }
  
}
