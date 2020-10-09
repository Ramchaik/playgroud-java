package LinkedList;

import java.util.Scanner;

public class ReturnKthToLast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedListNode head = new LinkedListNode(-1);

    System.out.println("Enter -1 to End the list.");
    int data = 0;
    while (data != -1) {
      data = sc.nextInt();
      LinkedListNode.appendToTail(head, data);
    }

    System.out.print(" Enter k: ");
    int k = sc.nextInt();

    LinkedListNode.printList(head);

    System.out.println("k th last element is: " + returnKthToLast(head, k));
  }

  static int returnKthToLast(LinkedListNode head, int k) {
    LinkedListNode current = head;
    int size = 0;

    while (current != null) {
      size++;
      current = current.next;
    }

    current = head;
    int target = size - k;

    if (target < 0 || k < 0)
      return -1;

    size = 0;
    while (current != null) {
      if (++size == target)
        return current.data;
      current = current.next;
    }

    return -1;
  }

  /**
   * Recursive Approaches
   */

  int printKthToLast(LinkedListNode head, int k) {
    if (head == null) {
      return 0;
    }

    int index = printKthToLast(head.next, k) + 1;

    if (index == k) {
      System.out.println(k + " th to the last node is " + head.data);
    }

    return index;
  }

  class Index {
    public int val = 0;
  }

  LinkedListNode kthToLast(LinkedListNode head, int k) {
    Index i = new Index();
    return kthToLast(head, k, i);
  }

  LinkedListNode kthToLast(LinkedListNode head, int k, Index i) {
    if (head == null) {
      return null;
    }

    LinkedListNode node = kthToLast(head.next, k, i);
    i.val = i.val + 1;

    if (i.val == k) {
      return head;
    }

    return node;
  }

  /**
   * Iterative
   */
  LinkedListNode nthToLast(LinkedListNode head, int k) {
    LinkedListNode p1 = head;
    LinkedListNode p2 = head;

    for (int i = 0; i < k; ++i) {
      if (p1.next == null)
        return null;
      p1 = p1.next;
    }

    while (p1 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    return p2;
  }
}
