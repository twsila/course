
class Mobile{
    String brand;
    int price;
    static String name;


    public Mobile() {
        brand = "";
        price = 2570;
        System.out.println("in constructor block");
    }

    public void show(){
        System.out.println("Brand: " + brand+"\nPrice: " + price+"\nMobie's name: "+name);
    }

    static  {
        name = "Phone";
        System.out.println("in static block");
    }
}
public class DemoStaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 3170;
//        Mobile.name = "SmartPhone";
//
//        Mobile obj2 = new Mobile();
    }
}
