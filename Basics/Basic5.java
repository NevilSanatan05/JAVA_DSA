public class Basic5 {
  public static void main(String[] args) {

int arr[] = {1, 2, 3, 4, 6};
int target = 7;
int left = 0;
int right = arr.length-1;
for(int i=0;i<arr.length;i++){
if(arr[left]+arr[right]==target){
 System.out.println(arr[left]+" " +arr[right]);
 break;
}
}
  }
}