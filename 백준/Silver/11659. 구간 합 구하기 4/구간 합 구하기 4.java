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

        st = new StringTokenizer(br.readLine());

        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a.length; i++){
            a[i] = parse(st.nextToken());
        }

        int[] s = new int[n];
        s[0] = a[0];

        for(int i = 1; i < s.length; i++) {
            s[i] = s[i-1] + a[i];
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int k = parse(st.nextToken()) - 1;
            int j = parse(st.nextToken()) - 1;

            if(k == j) {
                sb.append(a[k]).append("\n");
                continue;
            }

            if(k == 0) {
                sb.append(s[j]).append("\n");
                continue;
            }

            sb.append(s[j] - s[k-1]).append("\n");
        }

        System.out.print(sb);
    }

}