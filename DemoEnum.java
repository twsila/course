enum Status{
<<<<<<< HEAD
  Running,Failed,Pending,Success;
}

public class DemoEnum {
  public static void main(String[] args) {
    Status s = Status.Success;
   System.out.println(s.getClass().getSuperclass());
    switch (s) {
      case Running:
        System.out.println("All Good");
        break;

      case Failed:
        System.out.println("Try Again");
        break;

      case Pending:
        System.out.println("Please Wait");
        break;

      case Success:
        System.out.println("Done");
        break;

        
      default:
        break;
    }
  }
  
}
=======
    Running,
    Failed,
    Pending,
    Success
}
public class DemoEnum {
    public static void main(String[] args) {
        int i=5;
        Status[] ss = Status.values();
        for(Status s : ss){
            System.out.println(s+" : "+s.ordinal());
        }
    }
}
>>>>>>> 3d6177eee5fb65cbf11d768324da0bcd41a54655
