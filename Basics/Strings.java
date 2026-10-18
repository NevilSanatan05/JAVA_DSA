import java.util.*;
public class Strings{
  public static void main(String[] args) {
 String word = "Hello World";
int count=1;
for(int i=0;i<word.length();i++){
  if(word.charAt(i) == ' '){
    count++;
  }
}

System.out.println("Words: "+count);
   
  }
}