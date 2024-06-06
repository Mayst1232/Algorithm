import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ChangeArray ca;

        st = new StringTokenizer(br.readLine());

        int s0 = parse(st.nextToken());
        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        ca = new ChangeArray(s0);

        for(int i = 0; i < n + m; i++) {
            ca.insertNumber(parse(br.readLine()));
        }

        System.out.println(ca.size);
    }
}

class ChangeArray {
    int size;
    int currentSize;

    public ChangeArray(int s) {
        this.size = s;
        this.currentSize = s;
    }

    public void insertNumber(int n) {
        if(n == 1) {
            if(currentSize == 0) {
                currentSize = (size * 2) - size;
                size *= 2;

            }

            currentSize--;
        } else if (n == 0) {
            currentSize++;
        }
    }
}