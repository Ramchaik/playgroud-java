package LinkedList;

public class LinkedList<T> {

  Node<T> head;

  public void add(T data) {
    Node<T> node = new Node<T>(data);

    if (head == null) {
      head = node;
      return;
    }

    Node<T> temp = head;
    while (temp.next != null)
      temp = temp.next;

    temp.next = node;
  }

  public Node<T> getHead() {
    return head;
  }

  public void setHead(Node<T> head) {
    this.head = head;
  }

  public void print() {
    Node<T> temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}
