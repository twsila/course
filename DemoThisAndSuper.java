class a{
    public a(){
        super();
        System.out.println("in a");
    }
    public a(int n){
        super();
        System.out.println("in a int");
    }
    public a(String s){
        super();
        System.out.println("in class a parameterized String constructor ----> "+s);
    }
}
class b extends a{
    public b(){
        super();
        System.out.println("in b");
    }

    public b(int n){
        this();
        System.out.println("in b int");
    }
}
public class DemoThisAndSuper {
    public static void main(String[] args) {
        b b = new b(2);
    }
}
