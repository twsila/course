public class Ternary {
  public static void main(String[] args) {
    int n = 42;
    String result = " ";
    // if(n%2==0){
    //   result = "Even Value";
    // }else{
    //   result = "Odd Value";
    // }

    result = n%2==0 ? "Even Value..":"Odd Value..";

    System.out.println(result);

  }
}
