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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] a = new int[3];
        int t = parse(br.readLine());

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            a[0] = (int) Math.pow(parse(st.nextToken()), 2);
            a[1] = (int) Math.pow(parse(st.nextToken()), 2);
            a[2] = (int) Math.pow(parse(st.nextToken()), 2);

            Arrays.sort(a);

            if(a[2] == a[1] + a[0]) {
                sb.append("Case #").append(i + 1).append(": ").append("YES");
            } else {
                sb.append("Case #").append(i + 1).append(": ").append("NO");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

}