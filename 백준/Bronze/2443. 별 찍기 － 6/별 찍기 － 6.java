import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = n; i > 0; i--) {
            for(int j = i; j < n; j++) {
                sb.append(" ");
            }

            for(int j = 0; j < (i * 2) - 1; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }

}