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
        int[] count = new int[10001];

        for(int i = 0; i < n; i++) {
            count[parse(br.readLine())]++;
        }

        for(int i = 1; i < count.length; i++) {
            while(count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }

        System.out.print(sb);
    }
}