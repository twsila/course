public class DemoIfElse2 {
  public static void main(String args[]) {
      
    //Print the bigger number
    int a = 10;
    int b = 200;
    int c = 3;

    if(a>b && a>c){
      System.out.println(a);  
    }else if(b>c){
      System.out.println(b);
    }else{
      System.out.println(c);   
    }
  }
}
