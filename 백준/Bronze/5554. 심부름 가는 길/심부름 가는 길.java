import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = parse(br.readLine());
        int b = parse(br.readLine());
        int c = parse(br.readLine());
        int d = parse(br.readLine());

        int sum = a + b + c + d;

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }

}