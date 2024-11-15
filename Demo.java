public class Demo {
  public static void main(String[] args) {
    int x = 5;
    int y = 6;
    boolean result = x<y;
    System.out.println(result);
    int a = 3;

    int b = 6;

    int result2 = (~a & b) | (a & ~b);

    System.out.println(result2);

    int xx = 5;

    int yy = 10;

    int z = (xx++ > 5 && yy-- < 10) ? xx-- : yy;
    System.out.println("x :"+xx);
    System.out.println("y :"+yy);
    }
  }

