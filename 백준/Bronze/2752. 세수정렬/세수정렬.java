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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int[] a = new int[3];
        for(int i = 0; i < a.length; i++) {
            a[i] = parse(st.nextToken());
        }

        Arrays.sort(a);

        for(int i = 0; i < a.length; i++) {
            sb.append(a[i]).append(" ");
        }

        System.out.println(sb);
    }

}