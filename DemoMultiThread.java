class AA3 extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class BB3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class DemoMultiThread {
    public static void main(String[] args) {
        AA3 obj1 = new AA3();
        BB3 obj2 = new BB3();
        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
        System.out.println(obj2.getPriority());
    }
}
