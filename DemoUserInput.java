import java.util.Scanner;

public class DemoUserInput {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);

    }
}
