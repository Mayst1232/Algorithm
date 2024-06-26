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

        int n = parse(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a = parse(st.nextToken()) / 2;
        int b = parse(st.nextToken());

        System.out.println(Math.min(n, a + b));
    }

}