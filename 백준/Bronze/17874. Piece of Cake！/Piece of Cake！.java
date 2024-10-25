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

        int n = parse(st.nextToken());
        int h = parse(st.nextToken());
        int v = parse(st.nextToken());

        int checkH = n - h;
        int checkV = n - v;

        int size = Math.max(checkH, h) * Math.max(checkV, v) * 4;

        System.out.println(size);
    }
}