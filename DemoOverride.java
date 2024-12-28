class First {
    public void show() {
        System.out.println("in First show");
    }

    public void config() {
        System.out.println("in A config");
    }
}
 class Second extends First {
        public void show(){
            System.out.println("in Second show");
        }
 }
public class DemoOverride {
    public static void main(String[] args) {
        Second s = new Second();
        s.show();
        s.config();
    }
}
