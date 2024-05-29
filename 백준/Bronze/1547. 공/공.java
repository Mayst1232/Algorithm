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

        boolean[] a = {true, false, false};

        int m = parse(br.readLine());

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = parse(st.nextToken());
            int y = parse(st.nextToken());

            boolean z = a[x-1];
            a[x-1] = a[y-1];
            a[y-1] = z;
        }

        for(int i = 0; i < 3; i++) {
            if(a[i]) {
                System.out.println(i+1);
                return;
            }
        }

        System.out.println(-1);
    }
}