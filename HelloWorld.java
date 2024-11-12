class HelloWorld{
  public static void main(String[] args) {
    System.out.println(3+5);
    System.out.println(args[3]+args[5]);
    float f1 = 5.5f;
    double d1 = 2665000333333999999111111111111111111105.50011111111111111111111111;
    System.out.println(d1);

    byte b = 127;
    int a = 12;
    b = (byte)a;
    System.out.println(b);

    float f = 5.6f;
    System.out.println("Float Value: "+f);
    int x = (int)f;
    System.out.println("@int Value after casting float ot int: "+x);

    int c = 360;
    byte d = (byte) c;
    System.out.println(d);

    //type promotion
    byte v= 10;
    byte y= 40;

    int result = v*y;
    //Java Promot byte to int as result of two byte multiply is become int
    System.out.println(result);

    //default value assign to booleab
    boolean isPass = false;
    System.out.println(isPass);
    System.out.println("Jana is my lovely dughater");
  }
}