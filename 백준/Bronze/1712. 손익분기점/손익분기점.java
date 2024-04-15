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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = parse(st.nextToken());
        int b = parse(st.nextToken());
        int c = parse(st.nextToken());

        int result = 0;

        if(c <= b) {
            System.out.println(-1);
            return;
        }

        result = (a / (c-b)) + 1;

        System.out.println(result);
    }

}