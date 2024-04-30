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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = parse(br.readLine());

        int[][] a = new int[n][2];

        int[] rank = new int[n];

        for(int i = 1; i <= n; i++) {
            rank[i - 1] = i;
        }

        for(int i = 0; i < a.length; i++) {
            st = new StringTokenizer(br.readLine());

            a[i][0] = parse(st.nextToken());
            a[i][1] = parse(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            int rankNum = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }

                if(a[i][0] < a[j][0] && a[i][1] < a[j][1]) {
                    rankNum++;
                }
            }

            rank[i] = rankNum;
        }

        for(int i = 0; i < rank.length; i++) {
            sb.append(rank[i]).append(" ");
        }

        System.out.print(sb);
    }
}