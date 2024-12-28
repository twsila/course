public class DemoInheritance {
    public static void main(String[] args) {
//        Calc obj1 = new Calc();
//        int r1 = obj1.add(4,5);
//        int r2 = obj1.subtract(7,3);
//        System.out.println(r1+" "+r2);
        VeryAdvanceCalc obj1 = new VeryAdvanceCalc();
        int r1 = obj1.add(4,5);
        int r2 = obj1.subtract(7,3);
        int r3 = obj1.multi(4,4);
        int r4 = obj1.div(144,12);
        int r5 = (int) obj1.power(2,5);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
