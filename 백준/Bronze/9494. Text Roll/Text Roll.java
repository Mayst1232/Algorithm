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
            int count = 0;

            if(n == 0) break;

            for(int i = 0; i < n; i++) {
                String s = br.readLine();

                for(int j = count; j < s.length(); j++) {
                    if (s.charAt(j) == ' ') {
                        break;
                    }

                    count++;
                }
            }
            sb.append(count + 1).append("\n");
        }

        System.out.print(sb);
    }

}