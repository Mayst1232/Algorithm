import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        boolean[] a = new boolean[26];
        int count = 0;
        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        for(int i = 0; i < s.length(); i++) {
            if(a[s.charAt(i)-'a']) {
                count++;
            } else {
                a[s.charAt(i)-'a'] = true;
                sb.append(s.charAt(i));
            }
        }

        sb.append(count + 4).insert(0, 1906 + n);
        sb.reverse();
        sb.insert(0, "smupc_");
        System.out.println(sb);
    }
}