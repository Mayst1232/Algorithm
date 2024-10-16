import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        drawGol(n);
        drawGol(n);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n * 5; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    private static void drawGol(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n * 5; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}