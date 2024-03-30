import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];

        int answer = 0;

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < a.length - 2; i++) {
            for(int j = i + 1; j < a.length - 1; j++) {
                for(int k = j + 1; k < a.length; k++) {
                    int check = a[i] + a[j] + a[k];

                    if(check == m) {
                        answer = check;
                        break;
                    }

                    if(check < m && check > answer) {
                        answer = check;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}