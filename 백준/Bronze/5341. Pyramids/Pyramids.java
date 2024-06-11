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

        while (true) {
            int n = parse(br.readLine());

            if (n == 0) {
                break;
            }

            sb.append(pyramids(n)).append("\n");
        }

        System.out.print(sb);
    }

    public static int pyramids(int n) {
        if(n == 1) {
            return 1;
        }

        return n + pyramids(n - 1);
    }

}