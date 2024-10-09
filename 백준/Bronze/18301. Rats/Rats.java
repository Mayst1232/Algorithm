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

        st = new StringTokenizer(br.readLine());

        int n1 = parse(st.nextToken());
        int n2 = parse(st.nextToken());
        int n3 = parse(st.nextToken());

        System.out.println(((n1 + 1) * (n2 + 1)) / (n3 + 1) - 1);
    }
}