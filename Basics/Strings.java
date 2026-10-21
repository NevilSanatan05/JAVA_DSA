import java.util.*;

public class Strings {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    HashSet<Character> printed = new HashSet<>();
    String word = "programming";
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (map.get(ch) > 1 && !printed.contains(ch)) {
        System.out.println(ch + " appears " + map.get(ch) + " times");
      }
    }
  }
}