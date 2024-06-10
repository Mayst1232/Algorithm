import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());

        int[] s = new int[n];

        for(int i = 0; i < s.length; i++) {
            s[i] = i + 1;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        while (right < s.length) {
            int sum = 0;

            if (left == right) {
               if (s[left] == n) {
                   count++;
               }

               right++;
               continue;
            }

            for(int i = left; i <= right; i++) {
                sum += s[i];
            }

            if(sum == n) {
                count++;
                left++;
            } else if (sum > n) {
                left++;
            } else {
                right++;
            }
        }

        System.out.println(count);
    }

}