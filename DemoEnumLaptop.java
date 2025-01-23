enum Laptop{
  Macbook(2000),XPS(2200),Surface(850),ThinkPad;
  private Laptop(){
    price=500;

  }
  private Laptop(int price) {
    this.price = price;
  }
  
  private int price;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
}
public class DemoEnumLaptop {
  public static void main(String[] args) {
    Laptop lap = Laptop.Macbook;
    for(Laptop l:lap.values()){
      System.out.println(l+" : "+l.getPrice());
  }
    }
    
}
