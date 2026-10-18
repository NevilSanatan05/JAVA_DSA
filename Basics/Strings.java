import java.util.*;
public class Strings{
  public static void main(String[] args) {
  String word1 = "listen";
  String word2 = "silent";
  
  char[] arr1=word1.toCharArray();
  char[] arr2=word2.toCharArray();
  Arrays.sort(arr1); 
  Arrays.sort(arr2);
  if(Arrays.equals(arr1, arr2)){
    System.out.println("They are anagrams");
  } else{
    System.out.println("They are not anagrams");
  }
   
  }
}