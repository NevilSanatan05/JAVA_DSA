public class Basic3 {
  public static void main(String[] args) {
int arr[] = {2, 5, 8, 12, 18, 21, 30};
int target = 21;
int left = 0;
int right = arr.length - 1;
while (left <= right) {
  int mid = (left+right)/2;
  if(arr[mid]==target){
    System.out.println("Element found at index: "+mid);
    break;
  }
  else if(arr[mid]<target){
    left = mid + 1;
  }
  else{
    right = mid - 1;
  }
  }
}
}

