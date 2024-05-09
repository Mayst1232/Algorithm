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

        int n = parse(br.readLine());

        int[] a = new int[2];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            int t = parse(st.nextToken());
            a[0] += ((t / 30) + 1) * 10;
            a[1] += ((t / 60) + 1) * 15;
        }

        if(a[0] == a[1]) {
            sb.append("Y M ").append(a[0]);
        } else if (a[0] < a[1]) {
            sb.append("Y ").append(a[0]);
        } else {
            sb.append("M ").append(a[1]);
        }

        System.out.println(sb);
    }
}