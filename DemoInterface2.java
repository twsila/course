interface AInterface2{
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class BB2 implements AInterface2,Y{

    public void show() {
        System.out.println("in show....");
    }

    public void config() {
        System.out.println("in config....");
    }

    public void run() {
        System.out.println("running....");
    }
}
public class DemoInterface2 {
    public static void main(String[] args) {
        BB2 obj;
        obj = new BB2();
        obj.config();
        obj.show();
        obj.run();
    }
}
