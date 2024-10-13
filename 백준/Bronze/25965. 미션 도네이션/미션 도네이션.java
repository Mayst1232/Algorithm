import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = parse(br.readLine());

        for(int i = 0;  i < n; i++) {
            int m = parse(br.readLine());

            int[] k = new int[m];
            int[] d = new int[m];
            int[] a = new int[m];

            BigInteger total = BigInteger.ZERO;

            for(int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());

                k[j] = parse(st.nextToken());
                d[j] = parse(st.nextToken());
                a[j] = parse(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            BigInteger kill = new BigInteger(st.nextToken());
            BigInteger death = new BigInteger(st.nextToken());
            BigInteger assist = new BigInteger(st.nextToken());

            for(int j = 0; j < m; j++) {
                BigInteger calc = kill.multiply(BigInteger.valueOf(k[j]));
                calc = calc.subtract(death.multiply(BigInteger.valueOf(d[j])));
                calc = calc.add(assist.multiply(BigInteger.valueOf(a[j])));

                if(calc.compareTo(BigInteger.ZERO) > 0) {
                    total = total.add(calc);
                }
            }

            sb.append(total).append("\n");
        }

        System.out.print(sb);
    }
}