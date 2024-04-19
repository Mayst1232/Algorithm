import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static int binarySearch(int[] a, int search) {
        int left = 0;
        int right = a.length-1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(a[mid] > search) {
                right = mid - 1;
            } else if (a[mid] < search) {
                left = mid + 1;
            } else {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = parse(br.readLine());

        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            a[i] = parse(st.nextToken());
        }

        Arrays.sort(a);

        int m = parse(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            System.out.println(binarySearch(a, parse(st.nextToken())));
        }
    }
}