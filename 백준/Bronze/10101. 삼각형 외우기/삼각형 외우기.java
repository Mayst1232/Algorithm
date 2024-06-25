import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = parse(br.readLine());
        int b = parse(br.readLine());
        int c = parse(br.readLine());

        int sum = a + b + c;

        if(sum != 180) {
            System.out.println("Error");
            return;
        }

        if(a == b && b == c) {
            System.out.println("Equilateral");
            return;
        }

        if(a == b || b == c || a == c) {
            System.out.println("Isosceles");
            return;
        }

        System.out.println("Scalene");
    }

}