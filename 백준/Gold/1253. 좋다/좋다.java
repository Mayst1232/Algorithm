import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = parse(br.readLine());
        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a.length; i++) {
            a[i] = parse(st.nextToken());
        }

        Arrays.sort(a);
        int answer = 0;

        for(int i = 0; i < n; i++) {
            int left = 0;
            int right = n-1;

            while(true) {
                if(left == i) {
                    left++;
                } else if(right == i) {
                    right--;
                }

                if(left >= right) {
                    break;
                }

                if(a[left] + a[right] > a[i]) {
                    right--;
                } else if(a[left] + a[right] < a[i]) {
                    left++;
                } else {
                    answer++;
                    break;
                }
            }
        }
        
        System.out.println(answer);
    }
}