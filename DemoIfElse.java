public class DemoIfElse {
  public static void main(String args[]) {
    int x = 38;
    if(x>10 && x<=20)
        System.out.println("Hello");
    else    
        System.out.println("bye");
   
    //Print the bigger number
    int a = 1;
    int b = 2;

    if(a>b){
      System.out.println(a);
      System.out.println("a is the greater");
    }else{
      System.out.println(b);
      System.out.println("b is the greater");
    }
  }
}
