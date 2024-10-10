import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i > 0; i--) {
            int t = 2 * i - 1;

            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            while (true) {
                if(t == 0) {
                    break;
                }
                System.out.print("*");
                t--;
            }

            System.out.println();
        }

        for(int i = 2; i <= n; i++) {
            int t = 2 * i - 1;
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            while (true) {
                if(t == 0) {
                    break;
                }
                System.out.print("*");
                t--;
            }

            System.out.println();
        }
    }
}