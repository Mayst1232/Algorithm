import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < a; i++) {
            int number = i;
            int total = i;

            while(number > 0) {
                total += number % 10;
                number = number / 10;
            }

            if(total == a) {
                answer = i;
                break;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}