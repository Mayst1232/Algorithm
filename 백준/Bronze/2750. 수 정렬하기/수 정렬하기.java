import java.io.*;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = parse(br.readLine());
        boolean[] check = new boolean[2001];

        for(int i = 0; i < n; i++) {
            check[parse(br.readLine()) + 1000] = true;
        }

        for(int i = 0; i < check.length; i++) {
            if(check[i]) {
                sb.append(i - 1000).append("\n");
            }
        }

        System.out.println(sb);
    }
}