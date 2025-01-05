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
    }
}
