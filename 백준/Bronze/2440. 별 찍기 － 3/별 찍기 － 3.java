import java.io.*;

public class Main {

    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = parse(br.readLine());

        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

}