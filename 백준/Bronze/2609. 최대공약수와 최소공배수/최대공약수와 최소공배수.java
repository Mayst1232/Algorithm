import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int r1 = gcd(a,b);
        int r2 = lcd(a,b);

        System.out.println(r1 + " " + r2);
    }
    public static int gcd(int a, int b) {

        if(b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }

    public static int lcd(int a, int b) {
        return (a * b) / gcd(a,b);
    }

}