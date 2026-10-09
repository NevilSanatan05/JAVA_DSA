
public class Basic4 {
    public static void main(String[] args) {

       int arr[] = {1, 2, 3, 2, 1};
int target = 6;

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            // Expand the window
            sum = sum + arr[right];

            // Shrink the window while sum >= target
            while (sum >= target) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum = sum - arr[left];
                left++;
            }
        }

        System.out.println("Minimum length: " + minLength);
    }
}
