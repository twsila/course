class Mobile {
  String brand;
  int price;
  static String name;

  static void show(Mobile obj){
    System.out.println(obj.brand+" : "+obj.price+" : "+name);
  }
}
public class DemoStaticMethod {
  public static void main(String[] args) {
    Mobile.name = "Smart Phone";

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1499;
    obj1.show(obj1);

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1299;    
    obj2.show(obj2);
  }
}
