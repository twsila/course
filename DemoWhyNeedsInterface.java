interface ComputerInterface{
    void code();
}

class DeskTop implements ComputerInterface{

    public void code() {
        System.out.println("code, compile, run: Faster");
    }
}

class LapTop implements ComputerInterface{

    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer{
    public void devApp(ComputerInterface com){
        com.code();
    }
}
public class DemoWhyNeedsInterface {
    public static void main(String[] args) {
        ComputerInterface deskTop = new DeskTop();
        ComputerInterface lapTop = new LapTop();

        Developer abdulrahman = new Developer();
        abdulrahman.devApp(deskTop);
        abdulrahman.devApp(lapTop);
    }
}
