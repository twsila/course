public class Loop {
  public static void main(String[] args) {
    int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
    for(int[] n:nums){
      for(int j:n){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  
}
