import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = parse(br.readLine());

        for(int i = 0 ; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = parse(st.nextToken());
            int b = parse(st.nextToken());

            if(a % 10 == 0) {
                bw.write(String.valueOf(10));
                bw.write("\n");
                continue;
            }

            int num = a % 10;
            for(int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }

            bw.write(String.valueOf(num));
            bw.write("\n");
        }
        
        bw.close();
    }
}