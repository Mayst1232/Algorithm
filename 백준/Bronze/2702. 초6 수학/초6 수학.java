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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = parse(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = parse(st.nextToken());
            int b = parse(st.nextToken());

            int gcd;

            if(a >= b) {
                gcd = gcd(a, b);
            } else {
                gcd = gcd(b, a);
            }
            int lcd = gcd * (a / gcd) * (b / gcd);

            sb.append(lcd).append(" ").append(gcd).append("\n");
        }

        System.out.print(sb);

    }

    public static int gcd(int a, int b) {
        int check = a % b;

        if(check == 0) {
            return b;
        }

        return gcd(b, check);
    }
}