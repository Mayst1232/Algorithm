import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tCase = parse(br.readLine());

        for (int i = 0; i < tCase; i++) {

            LinkedList<int[]> q = new LinkedList<int[]>();

            st = new StringTokenizer(br.readLine());

            int n = parse(st.nextToken());
            int m = parse(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                q.add(new int[] {j, parse(st.nextToken())});
            }

            int count = 0;

            while (!q.isEmpty()) {
                int[] check = q.poll();
                boolean isMax = true;

                for(int j = 0; j < q.size(); j++) {
                    if(check[1] < q.get(j)[1]) {
                        q.add(check);

                        for(int k = 0; k < j; k++) {
                            q.add(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(!isMax) {
                    continue;
                }

                count++;
                if (check[0] == m) {
                    break;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}