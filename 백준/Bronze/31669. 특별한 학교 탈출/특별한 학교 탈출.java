import java.util.*;
import java.io.*;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = parse(st.nextToken());
        int m = parse(st.nextToken());

        int[] check = new int[m];

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            for(int j = 0; j < m; j++) {
                if(s.charAt(j) == 'O') {
                    check[j]++;
                }
            }
        }

        for(int i = 0; i < check.length; i++) {
            if(check[i] == 0) {
                System.out.println(i+1);
                return;
            }
        }

        System.out.println("ESCAPE FAILED");
    }
}