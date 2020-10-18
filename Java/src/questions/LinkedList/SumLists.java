package LinkedList;

import java.util.Scanner;

public class SumLists {
  public static LinkedList<Integer> inputList(LinkedList<Integer> list) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter -1 to End the list.");
    while (true) {
      int data = sc.nextInt();
      if (data == -1)
        break;

      list.add(data);
    }

    return list;
  }

  private static LinkedList<Integer> sumOfList(Node<Integer> l1, Node<Integer> l2) {
    LinkedList<Integer> fList = new LinkedList<>();
    int carry = 0;

    while (l1 != null && l2 != null) {
      int data = (l1.data + l2.data + carry);

      carry = (carry + data) / 10;
      data %= 10;

      fList.add(data);

      l1 = l1.next;
      l2 = l2.next;
    }

    if (l2 != null) {
      while (l2 != null) {
        int data = (l2.data + carry);
        carry = (carry + data) / 10;
        data %= 10;

        fList.add(data);
        l2 = l2.next;
      }
    } else {
      while (l1 != null) {
        int data = (l1.data + carry);
        carry = (carry + data) / 10;
        data %= 10;
        
        fList.add(data);
        l1 = l1.next;
      }
    }

    if (carry == 1) {
      fList.add(1);
    }

    return fList;
  }

  public static Node<Integer> reverseList(Node<Integer> head) {
    Node<Integer> next = null, prev = null, cur = head;

    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }

    return prev;
  }

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

    list1 = inputList(list1);
    list2 = inputList(list2);

    LinkedList<Integer> finalList = sumOfList(list1.getHead(), list2.getHead());

    finalList.print();

    System.out.println(" *** For non reversed list *** ");
    LinkedList<Integer> revSumList = sumOfList(list1.reverseList().getHead(), list2.reverseList().getHead()).reverseList();

    revSumList.print();
    

  }
}
