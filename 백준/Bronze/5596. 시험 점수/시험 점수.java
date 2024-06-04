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

        int s = 0;
        int t = 0;

        for(int i = 0; i < 2; i++) {

            st = new StringTokenizer(br.readLine());

            int max = 0;

            while (st.hasMoreElements()) {
                max += parse(st.nextToken());
            }

            if(i == 0) {
                s = max;
            } else {
                t = max;
            }
        }

        System.out.println(Math.max(s, t));
    }
}