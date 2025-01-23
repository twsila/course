enum Status{
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