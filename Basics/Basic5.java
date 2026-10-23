public class Basic5 {
  public static void main(String[] args) {

   int arr[] = {2, 3, 5, 3, 2, 7, 7};
   
    for(int i=0;i<arr.length;i++){
      int count = 0;
      for(int j=i+1;j<arr.length;j++){
        if(i!=j && arr[i]==arr[j]){
         count++;
        }
      }
       if (count == 0) {
                System.out.println(arr[i]);
            }
    }
   
  }
}