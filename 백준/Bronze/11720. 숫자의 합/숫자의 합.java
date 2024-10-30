import java.io.*;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());
        int sum = 0;

        String s = br.readLine();

        for(int i = 0; i < n; i++) {
            sum += parse(s.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}