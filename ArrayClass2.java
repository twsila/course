public class ArrayClass2 {
  public static void main(String[] args) {
    int nums[][] = new int[3][4];
    for(int n[]: nums){
      for (int m: n){
        m = (int)(Math.random() * 10);
        System.out.print(m+ " ");
      }
      System.out.println();
    }
    System.out.println(nums[0][0]);
    for(int n[]: nums){
      for (int m: n){
        System.out.print(m+ " ");
      }
      System.out.println();
    }
  }
}
