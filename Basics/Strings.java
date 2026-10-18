public class Strings{
  public static void main(String[] args) {
   String word = "Programming";
   int count =0;
   for(int i=0;i<word.length()-1;i++){
    if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
      count++;
    }
   }
   System.out.println("Vowels: "+count);

  }
}