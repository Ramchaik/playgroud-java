package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MainClass {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);

    map.putIfAbsent("one", 10);

    System.out.println(map.get("one"));
    System.out.println(map.get("four"));
    System.out.println(map.getOrDefault("four", 4));
    System.out.println(map.containsKey("four"));
    System.out.println(map.containsKey("one"));
    System.out.println(map.containsValue(3));

    map.replace("one", 2, 10);

    System.out.println(map);
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.entrySet());

    Set<Entry<String, Integer>> entries = map.entrySet();
    for (Entry<String, Integer> entry : entries) {
      entry.setValue(entry.getValue() * 100);
    }

    System.out.println(map);
  }

}
