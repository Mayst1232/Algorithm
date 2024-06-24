import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = parse(br.readLine());

        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j > 0; j--) {
                sb.append(" ");
            }

            for(int j = 0; j < (2 * i) - 1; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

}