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
        int l = parse(st.nextToken());
        int p = parse(st.nextToken());

        int people = l * p;

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++) {
            sb.append(parse(st.nextToken()) - people).append(" ");
        }

        System.out.println(sb);
    }

}