<<<<<<< HEAD
interface A{
  void show();
}

public class DemoFunctionalInterface {
    public static void main(String[] args) {
      
=======
@FunctionalInterface
interface AFunInterface{
    void show();
}

//class B2 implements AFunInterface{
//    public void show(){
//        System.out.println("in show.....");
//    }
//}class B2 implements AFunInterface{
//    public void show(){
//        System.out.println("in show.....");
//    }
//}
public interface DemoFunctionalInterface {
    public static void main(String[] args) {
        AFunInterface afun = new AFunInterface() {
            public void show() {
                System.out.println("from Anonymous --> in show.....");

            }
        };
        afun.show();
>>>>>>> 3d6177eee5fb65cbf11d768324da0bcd41a54655
    }
}
