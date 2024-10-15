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

        int[] a = new int[1001];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int si = parse(st.nextToken());
            int ti = parse(st.nextToken());
            int bi = parse(st.nextToken());

            for(int j = si; j <= ti; j++) {
                a[j] += bi;
            }
        }

        int max = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) max = a[i];
        }

        System.out.println(max);
    }
}