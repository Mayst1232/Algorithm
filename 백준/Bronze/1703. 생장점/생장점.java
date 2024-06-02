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

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = parse(st.nextToken());

            if(a == 0) {
                break;
            }

            int b = 1;

            for(int i = 0; i < 2 * a; i += 2) {
                b *= parse(st.nextToken());
                b -= parse(st.nextToken());
            }

            sb.append(b).append("\n");
        }

        System.out.print(sb);
    }
    
}