interface AAI{
  int age = 54;
  String location = "Hofuf";
  void show();
  void config();
}

class BB implements AAI{

  public void show() {
    System.out.println("in show....");
  }

  public void config() {
    System.out.println("in config....");
   
  }

  
 
  }


public class DemoInterface {
  public static void main(String[] args) {
    BB obj;
    obj = new BB();
    obj.show();
    obj.config();
    System.out.println(obj.age);
    System.out.println(obj.location);
  }

}
