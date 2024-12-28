class Mobile{
  String brand;
  int price;
  static String name;

  void show(){
    System.out.println(brand+" : "+price+" : "+name);
  }
}
public class DemoStaticVariable {
  public static void main(String[] args) {
    Mobile.name = "Smart Phone";

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;
    obj1.show();

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1350;    
    obj2.show();
  }
}
