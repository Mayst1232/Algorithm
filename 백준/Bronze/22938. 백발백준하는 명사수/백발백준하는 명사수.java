import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String a) {
        return Integer.parseInt(a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] a = new int[2][3];

        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        double rLength = Math.pow((a[0][2] + a[1][2]), 2);
        double cLength = Math.pow((a[0][0] - a[1][0]), 2) + Math.pow((a[0][1] - a[1][1]), 2);

        if(rLength > cLength) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}