public class DemoRunnableVsThreadLambda {
    public static void main(String[] args) {

        Runnable obj1 = ()-> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("HI");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable obj2 = ()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("HELLO");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        }
    }
