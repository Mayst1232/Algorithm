import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = parse(st.nextToken());
        int b = parse(st.nextToken());

        int aycount = 0;
        int bycount = 0;

        int x = 0;
        int y;

        while (a % 4 != 0) {
            a += 1;
            aycount++;
        }

        while (b % 4 != 0) {
            b += 1;
            bycount++;
        }

        if(a > b) {
            while (a != b){
                a -= 4;
                x++;
            }

        } else {
            while (a != b) {
                b -= 4;
                x++;
            }
        }

        y = Math.abs(aycount - bycount);

        System.out.println(x + y);
    }
}