class Mobile {
  

  
  static
  {
    System.out.println("I am in static block.....");
  }

  
 
}
public class DemoClassForName {
  public static void main(String[] args) throws ClassNotFoundException{
    Class.forName("Mobile");
  }
}
