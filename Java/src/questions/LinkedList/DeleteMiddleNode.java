package questions.linkedList;

import java.util.Scanner;
import questions.linkedList.LinkedListNode;

public class DeleteMiddleNode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedListNode head = new LinkedListNode(-1);

    System.out.println("Enter -1 to End the list.");
    int data = 0;
    while (data != -1) {
      data = sc.nextInt();
      LinkedListNode.appendToTail(head, data);
    }

    LinkedListNode.printList(head);

    deleteMiddleNode(head);

    LinkedListNode.printList(head);
  }

  static LinkedListNode deleteMiddleNode(LinkedListNode head) {
    LinkedListNode slow = head, fast = head, prev = null;

    while (fast.next != null && fast.next.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    if (prev != null) {
      prev.next = slow.next;
    }

    return head;
  }

  boolean deleteNode(LinkedListNode n) {
    if (n == null || n.next == null) {
      return false;
    }

    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;

    return true;
  }
}
