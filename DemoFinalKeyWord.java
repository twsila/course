class Calc2{
    public final void show(){
        System.out.println("in Calc show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class Calc3 extends Calc2{
    public void show2(){
        System.out.println("in Calc3 show");
    }
}
public class DemoFinalKeyWord {
    public static void main(String[] args) {
        final int num = 8;
        //num = 9;
        System.out.println(num);

        Calc3 calc = new Calc3();
        calc.add(2,8);
        calc.show();
        calc.show2();
    }
}
