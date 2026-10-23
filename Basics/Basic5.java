public class Basic5 {
  public static void main(String[] args) {

int arr1[] = {1, 2, 3, 4, 5};
int arr2[] = {2, 4, 6};   
   for(int i=0;i<arr1.length;i++){
    boolean found = false;
    for(int j=0;j<arr2.length;j++){
      if(arr1[i]==arr2[j]){
        found = true;
         break;
      }
    }
    if(found==false){
      System.out.println(arr1[i]);
    }
   }
   
  }
}