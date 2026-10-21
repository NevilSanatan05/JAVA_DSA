//import java.util.*;
public class Strings {
  public static void main(String[] args) {
    String word = "banana";
    int[] freq = new int[26];
    for (int i = 0; i < word.length(); i++) {

      char ch = word.charAt(i);
      freq[ch - 'a']++;
    }
    System.out.println("a appears "+freq['a'-'a']+" times");
    System.out.println("b appears "+freq['b'-'a']+" times");
    System.out.println("n appears "+freq['n'-'a']+" times");
  }
}