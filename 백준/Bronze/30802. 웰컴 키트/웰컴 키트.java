import java.io.*;
import java.util.*;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] size = new int[6];

        int n = parse(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < size.length; i++) {
            size[i] = parse(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int t = parse(st.nextToken());
        int p = parse(st.nextToken());

        int count = 0;

        for(int i = 0; i < size.length; i++) {
            while(size[i] > 0) {
                size[i] -= t;
                count++;
            }
        }

        int count2 = n / p;
        int count3 = n % p;

        System.out.println(count);
        System.out.println(count2 + " " + count3);
    }

}