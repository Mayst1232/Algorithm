import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while(true) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();

            st = new StringTokenizer(s);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n == 0 && m == 0) {
                break;
            }

            sb.append(n+m).append("\n");
            bw.write(sb.toString());
        }

        bw.close();
    }
}
