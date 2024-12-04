
class Calculator{
  int num=66;
  public int add(int num1,int num2,int num3){
    return num1+num2+num3;
  }
  public int add(int num1,int num2){
    return num1+num2;
  }
}

public class DemoCalculator {
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    int result2= obj.add(3, 4);
    int result3 = obj.add(3, 4,5);

    System.out.println("Result add two numbers: "+result2);
    System.out.println("Result add three numbers: "+result3);
    System.out.println(obj.num);

    Calculator obj2 = new Calculator();
    obj2.num=77;
    System.out.println(obj2.num);
  }
}
