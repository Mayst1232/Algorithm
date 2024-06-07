import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ChangeRock cr = new ChangeRock();

        String[] a = new String[100];
        Arrays.fill(a, "B");

        int p = parse(br.readLine());
        int n = parse(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int location = parse(st.nextToken());
            String direction = st.nextToken();

            if(direction.equals("R")) {
                for(int j = location; j < 100; j++) {
                    cr.moveRock(a, j);
                }
            } else {
                for(int j = location -2 ; j >= 0; j--) {
                    cr.moveRock(a, j);
                }
            }
        }

        int moon = Collections.frequency(Arrays.asList(a), "B");
        int hong = Collections.frequency(Arrays.asList(a), "R");
        int ahn = Collections.frequency(Arrays.asList(a), "G");

        System.out.printf("%.2f", p * ((double)moon / 100));
        System.out.println();
        System.out.printf("%.2f", p * ((double)hong / 100));
        System.out.println();
        System.out.printf("%.2f", p * ((double)ahn / 100));
    }
}

class ChangeRock {
    void moveRock(String[] a, int location) {
        if(a[location].equals("B")) {
            a[location] = "R";
        } else if (a[location].equals("R")) {
            a[location] = "G";
        } else {
            a[location] = "B";
        }
    }
}