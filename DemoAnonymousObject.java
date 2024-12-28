class A{
    public A() {
        System.out.println("******************************************");
        System.out.println("I will own a one Trillion Dollar Company");
    }

    public void show(){
        System.out.println("show() method has been executes.....");
        System.out.println("******************************************");
    }
}

public class DemoAnonymousObject {
    public static void main(String[] args) {
        new A().show(); // <-- This is an Anonymous Object
        new A().show(); // <-- This is an Anonymous Object
    }
}
