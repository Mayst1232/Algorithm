import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(br.readLine());

        int total = 0;
        List<Integer> insertNumber = new ArrayList<>();

        if(n == 0) {
            bw.write("0");
            bw.close();
            return;
        }

        for(int i = 0; i < n; i++) {
            insertNumber.add(parseInt(br.readLine()));
        }

        Collections.sort(insertNumber);

        int nAver = (int) Math.round(n * 0.15);

        for(int i = nAver; i < n - nAver; i++) {
            total += insertNumber.get(i);
        }

        int answer = Math.round((float) total / (n - (2 * nAver)));

        System.out.println(answer);
    }
}