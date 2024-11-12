public class DemoLogicalOperator {

  public static void main(String[] args) {
    int x = 7;
    int y = 5;
    int a = 5;
    int b = 9;

    boolean result = x > y && a > b;
    System.out.println(result);

    int c = 5;
    int d = 6;

    result = c > d;
    System.out.println(result);
    System.out.println(!result); //Falase and False is True;

  }
}