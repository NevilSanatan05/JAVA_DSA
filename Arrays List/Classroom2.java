
// import java.util.*;
// public class Classroom2 {
//   public static void main(String[] args) {

//     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     mainList.add(list);

//     ArrayList<Integer> list2 = new ArrayList<>();
//     list2.add(3);
//     list2.add(4);
//     mainList.add(list2);

//     for (int i = 0; i < mainList.size(); i++) {
//       ArrayList<Integer> currList = mainList.get(i);
//       for (int j = 0; j < currList.size(); j++) {
//         System.out.print(currList.get(j) + " ");
//       }
//       System.out.println();
//     }
//     System.out.println(mainList);
//   }
// }

//Container with Most Water (Brute Force)
// import java.util.*;

// public class Classroom2 {

//   public static int storeWater(ArrayList<Integer> height) {
//     int maxWater = 0;
//     // brute force
//     for (int i = 0; i < height.size(); i++) {
//       for (int j = i + 1; j < height.size(); j++) {
//         int ht = Math.min(height.get(i), height.get(j));
//         int width = j - 1;
//         int currWater = ht * width;
//         maxWater = Math.max(maxWater, currWater);
//       }

//     }
//     return maxWater;

//   }

//   public static void main(String[] args) {
//     ArrayList<Integer> height = new ArrayList<>();
//     // 1,8,6,2,5,4,8,3,7
//     height.add(1);
//     height.add(8);
//     height.add(6);
//     height.add(2);
//     height.add(5);
//     height.add(4);
//     height.add(8);
//     height.add(3);
//     height.add(7);

//     System.out.println(storeWater(height));
//   }
// }


import java.util.ArrayList;
public class Classroom2{
  //Brute Force
  public static boolean pairSum1(ArrayList<Integer> list,int target){
    for(int i=0;i<list.size();i++){
      for(int j=i+1;j<list.size();j++){
        if(list.get(i)+list.get(j)==target){
          return true;
        }
      }
    }
  return false;
}
  public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  //1,2,3,4,5,6
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
  int target = 5;
  System.out.println(pairSum1(list,target));
  
}

}