
interface AFunIntefaceReturnValue{
    int add(int i, int j);
}

public class DemoLambdaExpressionReturnValue {
    public static void main(String[] args) {
        AFunIntefaceReturnValue obj = (i,j) -> i+j; // Lambda Expression with Return value.
        int result = obj.add(4,5);
        System.out.println(result);
    }
}



