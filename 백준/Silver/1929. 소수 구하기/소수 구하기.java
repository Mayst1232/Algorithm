import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[n + 1];

        check[0] = check[1] = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(!check[i]) {
                for(int j = i * i; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }

        for(int i = m; i < check.length; i++) {
            if(!check[i]) {
                bw.write(String.valueOf(i));
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();
    }

}