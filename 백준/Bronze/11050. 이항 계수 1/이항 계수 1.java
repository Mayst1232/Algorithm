import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Factorial fact = new Factorial();

        int n = parse(st.nextToken());
        int k = parse(st.nextToken());

        int nfact = fact.factorial(n);

        int nMkfact = fact.factorial(n-k);

        if(n-k == 0) {
            nMkfact = 1;
        }

        int kfact = fact.factorial(k);
        if(k == 0) {
            kfact = 1;
        }

        System.out.println(nfact / (nMkfact * kfact));
    }
}

class Factorial {
    public int factorial(int a) {
        if(a <= 1) {
            return a;
        }
        return a * factorial(a - 1);
    }
}