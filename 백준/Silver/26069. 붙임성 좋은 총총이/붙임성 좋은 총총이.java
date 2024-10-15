import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int count = 1;

        List<String> check = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String ai = st.nextToken();
            String bi = st.nextToken();

            if (ai.equals("ChongChong")) {
                if(check.contains(bi)) {
                    continue;
                }
                check.add(bi);
                count++;
                continue;
            }

            if (bi.equals("ChongChong")) {
                if(check.contains(ai)) {
                    continue;
                }
                check.add(ai);
                count++;
                continue;
            }

            if(check.contains(bi)) {
                if(check.contains(ai)) {
                    continue;
                }

                check.add(ai);
                count++;
            }

            if(check.contains(ai)) {
                if(check.contains(bi)) {
                    continue;
                }

                check.add(bi);
                count++;
            }
        }

        System.out.println(count);
    }
}