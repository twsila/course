@FunctionalInterface
interface AFunInteface2{
    void show(int i);
}

public class DemoLambdaExpression {
    public static void main(String[] args) {
        AFunInteface2 afun = i -> System.out.println("from Lambda --> in show..... "+i);
        afun.show(18500000);
    }
}




