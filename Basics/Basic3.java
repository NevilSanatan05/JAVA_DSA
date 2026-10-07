public class Basic3 {
public static void main(String[] args) {
int arr[] = {8, 3, 12, 5, 20, 7, 15};
int largest = Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i]>largest && arr[i]%2!=0){
        largest = arr[i];
      System.out.println(arr[i]);

    }
}
}
}
