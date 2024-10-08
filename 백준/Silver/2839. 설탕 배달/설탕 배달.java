import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = numberCheck(n);

        System.out.println(answer);
    }

    public static int numberCheck(int n) {
        if(n == 4 || n == 7) {
            return -1;
        }

        if(n % 5 == 1 || n % 5 == 3) {
            return (n / 5) + 1;
        }

        if(n % 5 == 2 || n % 5 == 4) {
            return (n / 5) + 2;
        }

        return n / 5;
    }
}