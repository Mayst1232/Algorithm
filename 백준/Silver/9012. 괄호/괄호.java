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

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            int left = 0;
            int right = 0;

            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '(') {
                    left++;
                } else {
                    right++;
                }

                if(right > left) {
                    sb.append("NO").append("\n");
                    break;
                }

                if(j == s.length() - 1) {

                    if(right != left) {
                        sb.append("NO").append("\n");
                        break;
                    }

                    sb.append("YES").append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}