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

        int[] a = new int[3];
        int[] b = new int[3];

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            a[0] = parse(st.nextToken());
            a[1] = parse(st.nextToken());
            a[2] = parse(st.nextToken());

            b[0] = parse(st.nextToken());
            b[1] = parse(st.nextToken());
            b[2] = parse(st.nextToken());

            if(b[2] < a[2]) {
                b[2] += 60;
                b[1]--;
            }

            if(b[1] < a[1]) {
                b[1] += 60;
                b[0]--;
            }

            int s = b[2] - a[2];
            int m = b[1] - a[1];
            int h = b[0] - a[0];

            sb.append(h).append(" ").append(m).append(" ").append(s).append('\n');
        }

        System.out.print(sb);
    }
}