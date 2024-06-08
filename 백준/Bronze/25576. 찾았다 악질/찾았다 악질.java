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

        st = new StringTokenizer(br.readLine());
        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        int[] l1 = new int[m];
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < l1.length; i++) {
            l1[i] = parse(st.nextToken());
        }

        for(int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int sum = 0;

            for(int j = 0; j < l1.length; j++) {
                sum += Math.abs(l1[j] - parse(st.nextToken()));
            }

            if (sum > 2000) count++;

            if (count >= (n / 2)) {
                break;
            }
        }

        if(count >= (n / 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}