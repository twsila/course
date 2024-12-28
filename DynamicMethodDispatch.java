class AAA{
    public void show(){
        System.out.println("in A show");
    }

}

class BBB extends AAA{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

class CCC extends AAA{
    @Override
    public void show(){
        System.out.println("in C show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        AAA obj1 = new AAA();
        obj1.show();

        obj1 = new BBB();
        obj1.show();

        obj1 = new CCC();
        obj1.show();
    }



}
