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
            int l = 1;

            if(n == 0) {
                break;
            }

            while (n > 0) {
                int a = n % 10;
                n /= 10;

                if(a == 1) {
                    l += 3;
                } else if (a == 0) {
                    l += 5;
                } else {
                    l += 4;
                }
            }

            sb.append(l).append("\n");
        }

        System.out.print(sb);
    }

}