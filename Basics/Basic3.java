public class Basic3 {
public static void main(String[] args) {
int arr[] = {12, 5, 8, 21, 16, 7, 30, 9};
int smallest = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; i++) {
  if(arr[i]%2==0 && arr[i]<smallest){
    
    
    smallest = arr[i];
  }
  
}
System.out.println("Smallest even = "+smallest);
}
}
