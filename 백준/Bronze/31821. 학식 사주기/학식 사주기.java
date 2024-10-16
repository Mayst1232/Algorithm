import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());
        int[] price = new int[n];

        for(int i = 0; i < n; i++) {
            price[i] = parse(br.readLine());
        }

        int m = parse(br.readLine());

        int total = 0;

        for(int i = 0; i < m; i++) {
            int select = parse(br.readLine());
            total += price[select - 1];
        }

        System.out.println(total);
    }
}