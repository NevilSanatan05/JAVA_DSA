public class Basic3 {

  public static int binarySearch(int arr[],int target){
    int left = 0;
    int right = arr.length-1;
    while(left<=right){
      int mid = (left+right)/2;
      if(arr[mid]==target){
        return mid;
      }
      else if(arr[mid]<target){
        left = mid+1;
      }
      else{
        right = mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {2, 5, 8, 12, 18, 21, 30};
    int target = 21;
    int result = binarySearch(arr, target);
    if(result == -1){
      System.out.println("Element not found in the array");
    }
    else{
      System.out.println("Element found at index: " + result);
    }
  }
}
