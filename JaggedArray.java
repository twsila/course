public class JaggedArray {
  public static void main(String[] args) {
    int nums[][] = new int[3][];
    
    nums[0] = new int[3];
    nums[1] = new int[4];
    nums[2] = new int[2];
    /*System.out.println(nums.length);
    System.out.println(nums[0].length);
    System.out.println(nums[1].length);
    System.out.println(nums[2].length);*/
    
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums[i].length;j++){
        nums[i][j] = (int)(Math.random() * 10);
      }
    }
   
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums[i].length;j++){
        System.out.print(nums[i][j]+" ");
      }
      System.out.println();
    }
   
  }
}
