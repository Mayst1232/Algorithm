import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parse(br.readLine());

        int[] insert = new int[n];

        for(int i = 0; i < insert.length; i++) {
            insert[i] = parse(br.readLine());
        }

        Arrays.sort(insert);

        for(int i = 0; i < insert.length; i++) {
            bw.write(String.valueOf(insert[i]));
            bw.write("\n");
        }

        bw.close();
    }
}