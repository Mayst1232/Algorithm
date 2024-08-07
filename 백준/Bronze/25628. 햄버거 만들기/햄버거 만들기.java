import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = parse(st.nextToken());
        int b = parse(st.nextToken());

        int c = a / 2;

        if(c > b) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}