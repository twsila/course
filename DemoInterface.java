interface AInterface{
    void show();
    void config();
    int age=54;
    String color="blue";
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
        System.out.println(AInterface.age);
        System.out.println(AInterface.color);
    }
}
