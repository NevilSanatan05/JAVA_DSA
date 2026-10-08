public class Basic4 {
  public static void main(String[] args) {
int arr[] = {3, -2, 5, -1, 6, -3};  
  int currentSum = 0;
    int maxSum = 0;
    for(int i=0;i<arr.length;i++){
      currentSum = Math.max(arr[i],currentSum+arr[i]);

      if(currentSum>maxSum){
        maxSum=currentSum;
      }
    }
    System.out.println("Maximum subarray sum = "+maxSum);
  }
}
