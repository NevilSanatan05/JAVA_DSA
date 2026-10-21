import java.util.*;
public class Strings{
  public static void main(String[] args) {
   HashMap<Character,Integer>map=new HashMap<>();
   map.put('x', 1);
   map.put('x', map.get('x')+1);
   map.put('x', map.get('x')+1);
   System.out.println(map.get('x'));
  }
}