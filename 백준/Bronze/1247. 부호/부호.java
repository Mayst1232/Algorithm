import java.math.BigInteger;
import java.io.*;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++) {

            int n = parse(br.readLine());

            BigInteger a = new BigInteger("0");

            for(int j = 0; j < n; j++) {
                a = a.add(new BigInteger(br.readLine()));
            }

            int b = a.compareTo(BigInteger.ZERO);

            if(b == 0) {
                sb.append("0").append("\n");
                continue;
            }

            if(b > 0) {
                sb.append("+").append("\n");
                continue;
            }

            sb.append("-").append("\n");
        }

        System.out.print(sb);
    }
}