class Mobile {
  String brand;
  int price;
  static String name;

  
  static
  {
    name = "Phone";
  }

  public Mobile()
  {
    brand = " ";
    price = 200;
  }
  public void show(){
    System.out.println(brand+" : "+price+" : "+name);
  }
}

public class DemoStaticBlock {
  public static void main(String[] args) {
    //Mobile.name = "Smart Phone";

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1499;
    obj1.show();

    Mobile obj2 = new Mobile();
    obj2.show();
 
  }
}
