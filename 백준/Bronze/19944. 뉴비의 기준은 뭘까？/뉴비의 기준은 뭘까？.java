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

        if(m == 1 ||  m == 2) {
            System.out.println("NEWBIE!");
        } else if (m <= n) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }

}
