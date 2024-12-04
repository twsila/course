class Computer{
  public void playMusic(){
    System.out.println("Plying Music.....");
  }

  public String getMeAPen(int cost){
    if(cost >=7)
      return "Pen";     
    
    return "Nothing";
  }
  public String getMeAPen(){  
    return "All Pen are free";
  }
}

public class DemoClass {
  public static void main(String[] args) {
    Computer com = new Computer();
    com.playMusic();
    String str = com.getMeAPen();
    System.out.println(str);
  }
}

