import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] check = new String[3];

        int answer = 0;
        int count = 0;

        for(int i = 0; i < check.length; i++) {
            check[i] = br.readLine();
        }

        for(int i = 0; i < check.length; i++) {
            try {
                answer = Integer.parseInt(check[i]);
            } catch (Exception e) {
                answer = 0;
            }

            if(answer != 0) {
                count = i;
                break;
            }
        }

        if(count == 0) {
            answer += 3;
        } else if (count == 1) {
            answer += 2;
        } else {
            answer += 1;
        }

        if(answer % 3 == 0 && answer % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (answer % 3 == 0) {
            System.out.println("Fizz");
        } else if (answer % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(answer);
        }
    }

}