import java.util.HashMap;

public class Basic5 {
  public static void main(String[] args) {
  
   int arr[] = {1, 2, 2, 3, 4, 4, 5};
    for(int i=0;i<arr.length;i++){
      int j;
      for(j=0;j<i;j++){
        if(arr[i]==arr[j]){
        break;
        }
      }
      if(j==i){
        System.out.println(arr[i]+" ");
      }
    }
  }
}