public class Basic3 {
  public static void main(String[] args) {
    int arr[] = { 4, 6, 2, 8, 5, 3 };
    int prefixSum = 0;
    int prefixSumArr[] = new int[arr.length];
    int left = 1;
    int right = 4;
    for (int i = 0; i < arr.length; i++) {
      prefixSum += arr[i];
      prefixSumArr[i] = prefixSum;
      // System.out.println(prefixSum);
      
    }
    System.out.println(prefixSumArr[right] - prefixSumArr[left - 1]);
  }
}
