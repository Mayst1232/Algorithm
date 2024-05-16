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

        int a[] = {1, 1, 2, 2, 2, 8};

        int b[] = new int[6];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < b.length; i++) {
            b[i] = parse(st.nextToken());

            sb.append(a[i] - b[i]).append(" ");
        }

        System.out.println(sb);
    }
}