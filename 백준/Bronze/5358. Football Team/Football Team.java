import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();

            if(s == null || s.isEmpty()) {
                break;
            }

            char[] check = s.toCharArray();

            for(int i = 0; i < check.length; i++) {
                if(check[i] == 'i') {
                    check[i] = 'e';
                } else if (check[i] == 'e') {
                    check[i] = 'i';
                } else if (check[i] == 'I') {
                    check[i] = 'E';
                } else if (check[i] == 'E') {
                    check[i] = 'I';
                }
            }

            sb.append(String.valueOf(check)).append("\n");
        }

        System.out.print(sb);
    }
}