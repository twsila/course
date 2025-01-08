class AA4 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("H i");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class BB4 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("H e l l o");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class DemoRunnableVsThread {
    public static void main(String[] args) {
        Runnable obj1 = new AA4();
        Runnable obj2 = new BB4();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
