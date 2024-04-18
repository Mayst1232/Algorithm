import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> que = new LinkedList<>();
        st = new StringTokenizer(br.readLine());

        int n = parse(st.nextToken());
        int k = parse(st.nextToken());

        sb.append("<");

        for(int i = 1; i <= n; i++) {
            que.add(i);
        }

        while (que.size() > 1) {
            for(int i = 0; i < k-1; i++) {
                int temp = que.poll();
                que.add(temp);
            }
            int num = que.poll();
            sb.append(num).append(", ");
        }

        int num = que.poll();
        sb.append(num).append(">");

        System.out.println(sb);
    }
}