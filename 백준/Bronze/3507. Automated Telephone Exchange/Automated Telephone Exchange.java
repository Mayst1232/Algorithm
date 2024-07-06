import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());

        int count = 0;

        for(int i = 1; i < 100; i++) {
            if(n - i < 100) {
                count = 100 - i;
                break;
            }
        }

        System.out.println(count);
    }

}