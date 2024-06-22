import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());
        int count = 0;
        int i = 0;
        int j = 0;

        while (i <= n) {
            count += (i + j);

            if(i == j) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }

        System.out.println(count);
    }

}