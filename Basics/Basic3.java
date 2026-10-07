public class Basic3 {
  public static void main(String[] args) {
   int arr[] = {3, 7, 10, 15, 20, 25, 30};
   int target = 30;
   int left = 0;
   int right = arr.length-1;

   while(left<=right){
    int mid = (left+right)/2;
    if(arr[mid]==target){
      System.out.println("Found at index "+ mid);
      break;
    }
    else if(target>arr[mid]){
      left=mid+1;
    }
    else{
      right=mid-1;
    }
   }
  }
  }
