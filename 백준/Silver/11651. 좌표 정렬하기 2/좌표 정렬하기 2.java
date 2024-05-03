import java.util.*;
import java.io.*;

public class Main {

    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = parse(br.readLine());
        int[][] a = new int[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i][0] = parse(st.nextToken());
            a[i][1] = parse(st.nextToken());
        }

        Arrays.sort(a, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        for(int i = 0; i < n; i++) {
            sb.append(a[i][0]).append(" ").append(a[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}