interface AInterface{
    void show();
    void config();
}

class BB1 implements AInterface{

    public void show() {
        System.out.println("in show....");
    }

    public void config() {
        System.out.println("in config....");
    }
}
public class DemoInterface {
    public static void main(String[] args) {
        AInterface obj;
        obj = new BB1();
        obj.config();
        obj.show();
    }
}
