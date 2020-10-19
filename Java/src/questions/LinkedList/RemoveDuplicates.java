package questions.linkedList;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedListNode head = new LinkedListNode(0);
    System.out.println("Enter -1 to End the program.");
    int data = 0;
    while (data != -1) {
      data = sc.nextInt();
      LinkedListNode.appendToTail(head, data);
    }

    LinkedListNode.printList(head);

    System.out.println("======//////////////////=====");

    // deleteDuplicates(head);
    deleteDuplicates(head);
  }


  static void deleteDuplicates(LinkedListNode head) {
    HashSet<Integer> set = new HashSet<>();
    LinkedListNode current = head, prev = null;

    while (current != null) {
      if (set.contains(current.data)) {
        prev.next = current.next;
      } else {
        set.add(current.data);
        prev = current;
      }

      current = current.next;
    }

    LinkedListNode.printList(head);
  }

  static void removeDups(LinkedListNode head) {
    LinkedListNode current = head;

    while (current != null) {
      LinkedListNode runner = current;

      while (runner.next != null) {
        if (runner.data == current.data) {
          runner.next = runner.next.next;
        } else {
          runner = runner.next;
        }
      }

      current = current.next;
    }

    LinkedListNode.printList(head);
  }
  
}
