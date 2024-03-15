import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        int N = Integer.parseInt(br.readLine());
        int number = 666;

        while(true) {
            if(String.valueOf(number).contains("666")) {
                count++;
                if(N == count) {
                    break;
                }
            }

            number++;
        }

        bw.write(String.valueOf(number));
        bw.close();
    }
}