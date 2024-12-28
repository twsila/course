abstract class Cars {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music....");
    }
}

class WagonR extends Cars{
        public void drive(){
            System.out.println("Driving....");
        }
        public void fly(){
            System.out.println("Flying....");
        }

}

class Demo1 {
    public static void main(String[] args) {
    Cars obj = new WagonR();
    obj.drive();
    obj.playMusic();
    obj.fly();
    }
}
