public class Basic5 {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 2, 4, 5 };
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        System.out.println("Array is not sorted");
        return;
      }
    }

    System.out.println("Array is sorted");

  }
}