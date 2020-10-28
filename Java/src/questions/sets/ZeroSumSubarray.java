package questions.sets;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {
  public static void main(String[] args) {
    // time - O(n), space - O(n)
    Set<Integer> set = new HashSet<>();
    int a[] = {1, 3 , 5 , -3, 2, 8 };
    int k = 5;
    boolean found = false;
    int sum = 0;

    for (int elem : a) {
      set.add(sum);
      sum += elem;
      
      // x + k = y -> x = y- k
      if (set.contains(sum - k)) {
        found = true;
        break;
      }

    }

    if (found) System.out.println("Has sub-array with sum equal to " + k);
    else System.out.println("Sub-array not present");
  }

}
