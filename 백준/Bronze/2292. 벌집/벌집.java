import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());
        int a = 1;
        int count = 0;

        while (true) {
            if(a >= n) {
                count++;
                break;
            }

            n -= a;
            if(count == 0) {
                a += 5;
            } else {
                a += 6;
            }

            count++;
        }

        System.out.println(count);
    }
}