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

        int[] a = new int[8];
        String flag = "";

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 8; i++) {
            a[i] = parse(st.nextToken());
        }

        for (int i = 0; i < 7; i++) {
            if (a[i] == a[i + 1] - 1) {
                flag = "ascending";
                continue;
            } else if (a[i] == a[i + 1] + 1) {
                flag = "descending";
                continue;
            }

            flag = "mixed";
            break;
        }

        System.out.println(flag);
    }
}