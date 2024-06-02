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

        int answer;

        if (b == 10) {
            answer = (a % 100) - (a % 10);
            System.out.printf("%02d%n", answer);
            return;
        } else if (b == 100){
            answer = 0;
            System.out.printf("%02d%n", answer);
            return;
        } else {
            a -= (a % 100);
        }

        while (true) {
            if(a % b == 0) {
                answer = a % 100;
                break;
            }

            a++;
        }

        System.out.printf("%02d%n", answer);
    }
}