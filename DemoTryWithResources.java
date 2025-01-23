import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoTryWithResources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        //BufferedReader br = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {// Auto Close Resources
            //InputStreamReader in = new InputStreamReader(System.in);
            //br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
