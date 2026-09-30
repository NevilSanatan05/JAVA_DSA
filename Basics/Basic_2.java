public class Basic_2{
  public static void main(String[] args) {
int arr[] = {0, 1, 0, 3, 12};int largest = arr[0];
int position = 0;
for(int i=0;i<arr.length;i++){
  if(arr[i]!=0){
   arr[position]=arr[i];
    position++;
  }
}
  while(position<arr.length){
    arr[position]=0;
    position++;
  }
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
}
  
}