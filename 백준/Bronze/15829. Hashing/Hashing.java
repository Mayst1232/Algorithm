import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = parse(br.readLine());

        String s = br.readLine();

        BigInteger hash = new BigInteger("0");

        for(int i = 0; i < a; i++) {
            hash = hash.add(BigInteger.valueOf(s.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(hash.remainder(BigInteger.valueOf(1234567891)));
    }
}