import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++) {
            String s = br.readLine();
            if(s.length() >= 6 && s.length() <= 9) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}