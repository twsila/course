class AbdulrahmanException extends Exception {
    public AbdulrahmanException(String str) {
        super(str);
    }
}
public class DemoException {
    public static void main(String[] args) {
        int i=20;
        int j=0;


        try
        {
            j=18/i;
            if(j==0){
                throw new AbdulrahmanException("I don't want to print zero!!!");
            }
        } catch (AbdulrahmanException e) {
            //System.out.println("Can't divide by zero");
            j=18/1;
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Something went wrong: "+e.getMessage());
        }
        System.out.println(j);
        System.out.println("bye...");
    }
}
