import java.util.ArrayList;

public class Classroon {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(8);

    int max = Integer.MIN_VALUE;
    for(int i =0;i<list.size();i++){
      // if (max<list.get(i)) {
      //   max = list.get(i);
      // }

      max = Math.max(max, list.get(i));
    }
      System.out.println("max element = " + max);
    }

    // list.add(1, 9);
    // System.out.println(list);
    // System.out.println(list);
    // System.out.println(list.size());

    // print the arrayList
    // for (int i = 0; i < list.size(); i++) {
    // System.out.println(list.get(i) + " ");
    // }
    // System.out.println();
    // }

    // Reverse print
  //   for (int i = list.size() - 1; i >= 0; i--) {
  //     System.out.println(list.get(i) + " ");
  //   }
  //   System.out.println();
  // }

  // Get Operation
  // int element = list.get(2);
  // System.out.println(element);

  // //Remove operation
  // list.remove(2);
  // System.out.println(list);

  // //Set element at index
  // list.set(2,10);
  // System.out.println(list);

  // //contains element
  // System.out.println(list.contains(1));
  // System.out.println(list.contains(11));
}
