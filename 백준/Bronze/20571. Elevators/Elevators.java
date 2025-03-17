import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        st = new StringTokenizer(s);
        String a = st.nextToken();
        int floor = Integer.parseInt(st.nextToken());

        if(floor == 1) {
            System.out.println(0);
            return;
        }

        if(a.toCharArray()[0] == 'r') {
            if(floor % 5 != 0) {
                System.out.println((floor / 5) + 1);
            } else {
                System.out.println(floor / 5);
            }
        } else if (a.toCharArray()[0] == 'c') {
            if(floor % 7 != 0) {
                System.out.println((floor / 7) + 1);
            } else {
                System.out.println(floor / 7);
            }
        } else if (a.toCharArray()[0] == 'i') {
            if(floor % 4 != 0) {
                System.out.println((floor / 4) + 1);
            } else {
                System.out.println(floor / 4);
            }
        }
    }
}