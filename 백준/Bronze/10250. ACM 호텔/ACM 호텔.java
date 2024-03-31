//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static int parse(String a) {
//        return Integer.parseInt(a);
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int t = parse(br.readLine());
//
//        int[] a;
//
//        for(int i = 0; i < t; i++) {
//            st = new StringTokenizer(br.readLine());
//
//            int h = parse(st.nextToken());
//            int w = parse(st.nextToken());
//            int n = parse(st.nextToken());
//
//            a = new int[h*w];
//            int count = 0;
//
//            for(int k = 1; k <= w; k++) {
//                for(int l = 1; l <= h; l++) {
//                    if(k < 10) {
//                        sb.append(l).append(0).append(k);
//                    } else {
//                        sb.append(l).append(k);
//                    }
//                    a[count] = Integer.parseInt(sb.toString());
//                    count++;
//                    sb.setLength(0);
//                }
//            }
//
//            bw.write(String.valueOf(a[n-1]));
//            bw.write("\n");
//        }
//
//        bw.close();
//    }
//}

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tcc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tcc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            boolean top = n % y == 0;
            System.out.printf("%d%02d\n", top ? y : (n % y), top ? (n / y) : (n / y + 1));
        }
        //       bw.flush();
    }
}