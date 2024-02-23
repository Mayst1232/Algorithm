import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int number = 0;
            String insert = br.readLine();
            char[] check = insert.toCharArray();

            if(insert.equals("#")) {
                break;
            }

            for (int i = 0; i < check.length; i++) {
                if (check[i] == 'a' || check[i] == 'e' || check[i] == 'i' || check[i] == 'o' || check[i] == 'u') {
                    number++;
                }

                if (check[i] == 'A' || check[i] == 'E' || check[i] == 'I' || check[i] == 'O' || check[i] == 'U') {
                    number++;
                }
            }

            sb.append(number + "\n");
        }

        sb.deleteCharAt(sb.length() -1);

        bw.write(sb.toString());
        bw.close();
    }
}