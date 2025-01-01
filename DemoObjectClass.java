class Laptop{
    String model;
    int price;


}
public class DemoObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo ThinkPad";
        obj.price = 2000;
        System.out.println(obj.toString());
    }
}
