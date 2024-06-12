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

        int a = parse(br.readLine());
        int b = parse(br.readLine());
        int c = parse(br.readLine());

        sb.append(a + b - c).append("\n");

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);

        int ab = parse(s1 + s2) - c;

        sb.append(ab);

        System.out.println(sb);
    }

}