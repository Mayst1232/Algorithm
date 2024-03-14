import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean[] check = new boolean[1001];
        int answer = 0;
        int number[];

        check[0] = true;
        check[1] = true;

        for(int i = 2; i < check.length; i++) {
            if(check[i]) {
                continue;
            }

            for(int j = i*2; j < check.length; j += i){
                check[j] = true;
            }
        }

        number = new int[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < number.length; i++) {
            if(!check[Integer.parseInt(st.nextToken())]){
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}