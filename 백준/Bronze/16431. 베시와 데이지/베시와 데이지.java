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

        int[][] a = new int[3][2];

        for(int i = 0; i < a.length; i++) {
            st = new StringTokenizer(br.readLine());

            a[i][0] = parse(st.nextToken());
            a[i][1] = parse(st.nextToken());
        }

        int daisy = Math.abs(a[1][0] - a[2][0]) + Math.abs(a[1][1] - a[2][1]);
        int bessie = Math.max(Math.abs(a[0][0] - a[2][0]), Math.abs(a[0][1] - a[2][1]));

        if(daisy == bessie) {
            System.out.println("tie");
        } else if(daisy < bessie) {
            System.out.println("daisy");
        } else {
            System.out.println("bessie");
        }
    }
}