public class Strings {
  public static void main(String[] args) {
    String word = "Education";
    int vowels = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'a' ||
          word.charAt(i) == 'e' ||
          word.charAt(i) == 'i' ||
          word.charAt(i) == 'o' ||
          word.charAt(i) == 'u') {
        vowels++;
      }
    }
    System.out.println(vowels);
  }
}
