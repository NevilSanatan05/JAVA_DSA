public class Basic3 {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 1, 6, 3, 5 };
    int k = 3;
    int target = 12;
    int sumWin = 0;
    boolean isfound = false;
    for (int i = 0; i < k; i++) {
      sumWin = sumWin + arr[i];
    }
    int maxSum = sumWin;
    int minSum = sumWin;

    for (int i = k; i < arr.length; i++) {
      sumWin = sumWin + arr[i] - arr[i - k];
      if (sumWin > maxSum) {
        maxSum = sumWin;
      }
      if (sumWin < minSum) {
        minSum = sumWin;
      }
      if(sumWin>target){
        isfound = true;
        System.out.println("Found a window with sum greater than target: " + sumWin);
      }
    }
    // System.out.println("Max sum is: " + maxSum);
    // System.out.println("Min sum is: " + minSum);

    if(!isfound){
      System.out.println("No window found with sum greater than target.");
    }
  }
}
