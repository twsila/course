class A1 {
    public void show(){
        System.out.println("in class A1");
    }
    static class B1{
        public void config(){
            System.out.println("in config method class B1....");
        }
    }
}

public class DemoInnerClass {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();

        A1.B1 obj1 = new A1.B1();
        obj1.config();
    }
}
