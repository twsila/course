class AX{
    public void show1(){
        System.out.println("in AX show1");
    }
}

class BX extends AX{
    public void show2(){
        System.out.println("in BX show2");
    }
}
public class DemoUpAndDownCasting {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int) d;//<---- This is Type Casting
        System.out.println(i);

        AX obj = new BX();//<----- Up Casting
        obj.show1();

        BX obj2 = (BX) obj;//<----- Down Casting
        obj2.show2();
    }
}
