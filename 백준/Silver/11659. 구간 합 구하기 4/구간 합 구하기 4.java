import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        int[] a = new int[n + 1];
        int[] total = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < a.length; i++) {
            a[i] = parse(st.nextToken());
            total[i] = total[i-1] + a[i];
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());

            int x = parse(st.nextToken());
            int y = parse(st.nextToken());
            bw.write(String.valueOf(total[y] - total[x - 1]));
            bw.write("\n");
        }

        bw.close();
    }
}