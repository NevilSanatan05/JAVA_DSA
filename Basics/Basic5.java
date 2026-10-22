import java.util.HashMap;

public class Basic5{
  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 1, 4, 2};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      int ch = arr[i];
      map.put(ch,map.getOrDefault(ch,0)+1);
      
    }
    System.out.println(map);

  }
}