import java.io.*;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = parse(br.readLine());

        for(int i = 0; i < t; i++) {

            int c = parse(br.readLine());

            while (c > 0) {
                if(c >= 25) {
                    sb.append(c / 25).append(" ");
                    c %= 25;
                } else {
                    sb.append(0).append(" ");
                }

                if(c >= 10) {
                    sb.append(c / 10).append(" ");
                    c %= 10;
                } else {
                    sb.append(0).append(" ");
                }

                if(c >= 5) {
                    sb.append(c / 5).append(" ");
                    c %= 5;
                } else {
                    sb.append(0).append(" ");
                }

                if(c >= 1) {
                    sb.append(c).append("\n");
                    c = 0;
                } else {
                    sb.append(0).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}