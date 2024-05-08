import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int x = parse(st.nextToken());
        int y = parse(st.nextToken());
        int w = parse(st.nextToken());
        int h = parse(st.nextToken());

        int[] a = new int[4];

        a[0] = x;
        a[1] = y;
        a[2] = w - x;
        a[3] = h - y;

        System.out.println(Arrays.stream(a).min().getAsInt());
    }
}