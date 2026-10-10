public class Strings {
  public static void main(String[] args) {
String word = "Java2026";
    int digit = 0;
    int uppercase = 0;
    for(int i=0;i<word.length();i++){
      if(Character.isDigit(word.charAt(i))){
        digit++;
      }
      if(Character.isUpperCase(word.charAt(i))){
        uppercase++;
      }
    }
    System.out.println(uppercase);
    System.out.println(digit);
  }
}

