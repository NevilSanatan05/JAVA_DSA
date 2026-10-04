public class Basic3 {
  public static void main(String[] args) {
int arr[] = {2, 4, 6, 8, 10};
int k=3;
int windowSum = 0;

for(int i=0;i<k;i++){
  windowSum += arr[i];
}
System.out.println(windowSum);
for(int i = k; i < arr.length; i++) {
  windowSum = windowSum - arr[i-k] + arr[i];
  System.out.println(windowSum);
}
}
}

