package LinkedList;

public class LinkedListNode {
  LinkedListNode next = null;
  int data;

  public LinkedListNode(int data) {
    this.data = data;
  }

  static void appendToTail(LinkedListNode head, int d) {
    LinkedListNode end = new LinkedListNode(d);
    LinkedListNode n = head;

    while (n.next != null) {
      n = n.next;
    }
    n.next = end;
  }

  static LinkedListNode deleteNode(LinkedListNode head, int d) {
    LinkedListNode n = head;

    if (n.data == d) {
      head = n.next;
      return head;
    }

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        return head;
      }

      n = n.next;
    }

    return head;
  }

  static void printList(LinkedListNode head) {
    LinkedListNode current = head;

    while (current.next != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }

    System.out.print(current.data);
    System.out.println();
  }
}
