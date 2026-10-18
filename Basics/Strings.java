public class Strings{
  public static void main(String[] args) {
    String word = "Java123@DSA";
    int count = 0;
    for(int i=0;i<word.length();i++){

      if(Character.isLetter(word.charAt(i))){
        count++;
      }
    }
    System.out.println("Letters: "+count);
  }
}