abstract class Cars {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music....");
    }
}

abstract class WagonR extends Cars{
        public void drive(){
            System.out.println("Driving....");
        }


}
class UpdatedWagonR extends WagonR//concrete class
{

    @Override
    public void fly() {
        System.out.println("Flying....");
    }
}
class Demo1 {
    public static void main(String[] args) {
    Cars obj = new UpdatedWagonR();
    obj.drive();
    obj.playMusic();
    obj.fly();
    }
}
