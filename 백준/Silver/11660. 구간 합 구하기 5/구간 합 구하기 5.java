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

        st = new StringTokenizer(br.readLine());

        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        int[][] a = new int[n + 1][n + 1];

        for(int i = 1; i < a.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < a.length; j++) {
                a[i][j] = a[i][j - 1] + parse(st.nextToken());
            }
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = parse(st.nextToken());
            int y1 = parse(st.nextToken());
            int x2 = parse(st.nextToken());
            int y2 = parse(st.nextToken());

            int sum = 0;

            for(int j = x1; j <= x2; j++) {
                sum += a[j][y2] - a[j][y1 - 1];
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }

}