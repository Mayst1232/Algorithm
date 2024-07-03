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

        int h = parse(st.nextToken());
        int i = parse(st.nextToken());
        int a = parse(st.nextToken());
        int r = parse(st.nextToken());
        int c = parse(st.nextToken());

        System.out.println((h * i) - (a * r * c));
    }

}