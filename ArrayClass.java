public class ArrayClass {
  public static void main(String[] args) {
    int num[] = {3,4,5};
    for (int numList : num) {
          System.out.println(numList); 
    }

    num[1] = 15;
    System.out.println("****");
    for (int numList : num) {
      System.out.println(numList); 
    } 
    
    int nums2[] = new int[4];
    nums2[0] = 4;
    nums2[1] = 8;
    nums2[2] = 3;
    nums2[3] = 9;
    System.out.println("****");
    for (int numList : nums2) {
      System.out.println(numList); 
    }

  }
}
