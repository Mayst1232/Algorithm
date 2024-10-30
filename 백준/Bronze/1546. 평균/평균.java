import java.io.*;
import java.util.*;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = parse(br.readLine());

        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a.length; i++) {
            a[i] = parse(st.nextToken());
        }

        int max = 0;
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }

            sum += a[i];
        }

        System.out.println((sum * 100.0 / max) / n);
    }
}