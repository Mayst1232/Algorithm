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

            String name = st.nextToken();

            if(name.equals("#")) {
                break;
            }

            int age = parse(st.nextToken());
            int weight = parse(st.nextToken());

            if(age > 17 || weight >= 80) {
                sb.append(name).append(" Senior\n");
            } else {
                sb.append(name).append(" Junior\n");
            }
        }

        System.out.print(sb);
    }
}