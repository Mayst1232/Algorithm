import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();

        for(int i = 0; i < c.length; i++) {
            if(c[i] >= 65 && c[i] <= 90) {
                c[i] += 32;
            } else {
                c[i] -= 32;
            }
        }

        System.out.println(String.valueOf(c));
    }

}