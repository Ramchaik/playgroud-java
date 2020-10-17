import java.util.Stack;
import java.util.Vector;

public class MainClass {
  public static void main(String[] args) throws Exception {
    Vector<Integer> v = new Vector<>();
    v.add(3);
    v.add(30);

    Stack<Integer> s = new Stack<>();
    s.push(2);
    s.push(24);
    s.push(124);

    System.out.println("poped ele: " + s.pop());
    System.out.println("peek ele: " + s.peek());

    MyStack<Integer> S = new MyStack<>(); 
    S.push(3);
    S.push(33);
    S.push(333);

    System.out.println("Pop: " +  S.pop());
    System.out.println("Peek: "  + S.peek());
  }
  
}
