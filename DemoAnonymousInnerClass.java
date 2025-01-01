class A11 {
    public void show() {
        System.out.println("in A show");
    }
}
public class DemoAnonymousInnerClass {
    public static void main(String[] args) {
        A11 obj = new A11(){//Anonymous Inner Class
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
