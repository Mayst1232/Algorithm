import java.io.*;
import java.util.*;


public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = parse(st.nextToken());
        int b = parse(st.nextToken());
        int c = parse(st.nextToken());

        int d = parse(br.readLine());

        b += d / 60;
        d %= 60;
        c += d;

        if(c >= 60) {
            b += c / 60;
            c %= 60;
        }

        if(b >= 60) {
            a += b / 60;
            b %= 60;
        }

        if(a >= 24) {
            a %= 24;
        }

        sb.append(a).append(" ").append(b).append(" ").append(c);
        System.out.println(sb);
    }
}