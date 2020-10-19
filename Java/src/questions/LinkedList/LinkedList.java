package questions.linkedList;

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

  public LinkedList<T> reverseList() {
    Node<T> prev = null, next = null, cur = head;

    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }

    head = prev;
    return this;
  } 

  public int length() {
    Node<T> temp = head;
    int len = 0;

    while(temp != null) {
      len++;
      temp = temp.next;
    }

    return len;
  }

  public void addToHead(T data) {
    Node<T> node = new Node<T>(data);

    if (head != null) {
      node.next = head;
    }

    head = node;
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
