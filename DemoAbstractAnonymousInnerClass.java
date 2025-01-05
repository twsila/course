abstract class AD{
    public abstract void show();
}

public class DemoAbstractAnonymousInnerClass {
    public static void main(String[] args) {
        AD as = new AD() {
            public void show()
            {
                System.out.println("in New show");
            }
        };
        as.show();
    }
}
