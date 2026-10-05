public class Basic3 {
    public static void main(String[] args) {

       int arr[] = {1, 2, 3, 2, 1};
       int left = 0;
       int right = arr.length - 1;
       boolean palindrome = true;
       while(left<right){
        if(arr[left]!=arr[right]){
         palindrome = false;
         break;
        }
        left++;
        right--;
       }
       if(palindrome){
        System.out.println("The array is a palindrome");
        }else{
        System.out.println("The array is not a palindrome");
        }
    }
}