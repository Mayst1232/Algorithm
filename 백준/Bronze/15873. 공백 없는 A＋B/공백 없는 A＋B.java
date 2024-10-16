import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(s.length() == 2) {
            int a = Integer.parseInt(String.valueOf(s.charAt(0)));
            int b = Integer.parseInt(String.valueOf(s.charAt(1)));

            System.out.println(a + b);
        } else if (s.length() == 3) {
            if(s.charAt(2) == '0') {
                int a = Integer.parseInt(s.substring(0, 1));
                int b = Integer.parseInt(s.substring(1,3));

                System.out.println(a + b);
            } else {
                int a = Integer.parseInt(s.substring(0, 2));
                int b = Integer.parseInt(s.substring(2));

                System.out.println(a + b);
            }
        } else if (s.length() == 4) {
            int a = Integer.parseInt(s.substring(0, 2));
            int b = Integer.parseInt(s.substring(2, 4));

            System.out.println(a + b);
        }
    }
}