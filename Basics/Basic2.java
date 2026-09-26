public class Basic2 {
  public static void main(String[] args) {
   int arr[] = {5, 8, 5, 2, 8, 5, 9};
   int largest = arr[0];
   int count=0;
   int target = 5;
   boolean duplicate = false;
   int secondLargest = Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
      if(arr[i]!=arr[j]){
        duplicate = false;
        break;
      }
    }
    if(duplicate==false){
      System.out.println("Duplcate doesn't exists");
    }
    else{
      System.out.println("Duplcate");
    }
    int current = arr[i];
    if(arr[i]==target){
      count++;
    }
    if(current>largest){
      secondLargest = largest;
      largest = current;
    }
    else if (current>secondLargest && current!=largest){
      secondLargest=current;
    }
   }
   System.out.println("Second largest = " + secondLargest);
   System.out.println("5 occurs = "+count+" times");
  }
}
