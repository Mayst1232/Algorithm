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
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        for(int i = 0; i < n; i++) {
            sb2.append(br.readLine());
            sb.append(sb2.reverse()).append("\n");
            sb2.setLength(0);
        }

        System.out.print(sb);
    }

}