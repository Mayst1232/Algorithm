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
        int m = parse(st.nextToken());

        long count = 0;
        long[] s = new long[n + 1];
        long[] c = new long[m];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < s.length; i++) {
            s[i] = s[i - 1] + parse(st.nextToken());
        }

        for(int i = 1; i < s.length; i++) {
            s[i] %= m;
            if(s[i] == 0) count++;
            c[(int) s[i]]++;
        }

        for(int i = 0; i < c.length; i++) {
            if(c[i] > 1) {
                count += ((c[i] * (c[i] - 1)) / 2);
            }
        }

        System.out.println(count);
    }
}