public class DemoCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
    }
}

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
