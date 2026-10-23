public class Basic5 {
  public static void main(String[] args) {

    String str = "madam";
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) == str.charAt(right)) {
        System.out.println("Palindrome");
        return;
      }
      left++;
      right--;

    }
    System.out.println("Palindrome");
  }
}