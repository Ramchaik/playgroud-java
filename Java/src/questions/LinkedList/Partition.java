package questions.linkedList;

import java.util.Scanner;

public class Partition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    LinkedList<Integer> list = new LinkedList<Integer>();
  
    System.out.println("Enter -1 to End the program.");
    while (true) {
      int data = sc.nextInt();
      if (data == -1) break;

      list.add(data);
    }

    System.out.println("Enter parition value: ");
    int x = sc.nextInt();

    list.print();

    Node<Integer> head = list.getHead();
    Node<Integer> newHead = partitionList2(head, x);
    list.setHead(newHead);

    list.print();
  }

  public static Node<Integer> partitionList2(Node<Integer> node, int x) {
    Node<Integer> head = node;
    Node<Integer> tail = node;

    while (node != null) {
      Node<Integer> next = node.next;

      if (node.data < x) {
        // Add at head
        node.next = head;
        head = node;
      } else {
        // Add at tail
        tail.next = node;
        tail = node;
      }

      node = next;
    }

    tail.next = null;

    return head;
  }

  public static Node<Integer> partitionList(Node<Integer> node, int x) {
    Node<Integer> leftStart = null;
    Node<Integer> rightStart = null;
    Node<Integer> leftEnd = null;
    Node<Integer> rightEnd = null;

    while (node != null) {
      Node<Integer> next = node.next; 

      node.next = null;

      if (node.data < x) {
        if (leftStart == null) {
          leftStart = node;
          leftEnd = node;
        } else {
          leftEnd.next = node;
          leftEnd = node;
        }
      } else {
        if (rightStart == null) {
          rightStart = node;
          rightEnd = node;
        } else {
          rightEnd.next = node;
          rightEnd = node;
        }
      }

      node = next;
    }

    if (leftStart == null) return rightStart;

    leftEnd.next = rightStart;
    return leftStart;
  }
}
