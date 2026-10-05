public class Basic3 {
  public static void main(String[] args) {
    int arr[] = { 2, 1, 5, 1, 3, 2 };
    int k = 3;
    int sumWin = 0;
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
    }
      // System.out.println("Max sum is: " + maxSum);
      System.out.println("Min sum is: " + minSum);

    }
  }
