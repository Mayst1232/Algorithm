import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int s = Integer.parseInt(br.readLine());

            int start = 1;
            int end = 50;

            if(s == 0) {
                break;
            }

            while (start <= end) {
                int center = (start + end) / 2;

                if (center == s) {
                    sb.append(center).append("\n");
                    break;
                } else if (center < s) {
                    start = center + 1;
                } else {
                    end = center - 1;
                }

                sb.append(center).append(" ");
            }
        }

        System.out.print(sb);
    }
}