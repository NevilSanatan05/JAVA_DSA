public class Strings{
  public static void main(String[] args) {
    String word = "Java123 @ DSA";
    int count = 0;
    int countDig = 0;
    int countSpa = 0;
    for(int i=0;i<word.length();i++){

      if(Character.isLetter(word.charAt(i))){
        count++;
      }
      if(Character.isDigit(word.charAt(i))){
        countDig++;
      }
      if(Character.isSpaceChar(word.charAt(i))){
        countSpa++;
      }
    }
    System.out.println("Letters: "+count);
    System.out.println("Digits: "+countDig);
    System.out.println("Spaces: "+countSpa);
  }
}