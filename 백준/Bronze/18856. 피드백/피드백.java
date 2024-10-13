import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[n-1] = 997;

        for(int i = 2; i < n - 1; i++) {
            a[i] = i + 1;
        }

        System.out.println(n);

        for(int i = 0; i < n; i++) {
            sb.append(a[i]).append(" ");
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb);
    }
}