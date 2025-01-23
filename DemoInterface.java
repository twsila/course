<<<<<<< HEAD
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

=======
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
>>>>>>> 3d6177eee5fb65cbf11d768324da0bcd41a54655
}
